/**
 *  HEM Daily Reset Manager
 *
 *  Copyright 2017
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *
 */
definition(
    name: "HEM Daily Reset Manager"
    namespace: "jasonrwise77",
    author: "Jason Wise",
    description: "Resets the Energy Monitor Daily on a specified time",
    category: "My Apps",
    iconUrl: "My-SmartThings/SmartApps/HEM Reset Manager/Icon Small.pngonvenience%402x.png"",
    iconX2Url: "My-SmartThings/SmartApps/HEM Reset Manager/Icon Large.png")

preferences {
    section("Choose an Energy Meter to reset:") {
        input(name: "meters", type: "capability.energyMeter", title: "Which Energy Meter? (tap here)", description: null, multiple: true, required: true, submitOnChange: true)
    }
    section("Reset Time of Day") {
        input "time", "time", title: "At this time of day"
    }
}
def installed() {
    log.debug "Daily Energy Meter Reset Manager SmartApp installed, now preparing to schedule the first reset."
}
def updated() {
    log.debug "Daily Energy Meter Reset Manager SmartApp updated, so update the user defined schedule and schedule another check for the next day."
    unschedule()
    initialize()
}
def initialize() {
    unschedule()
    schedule(time, resetEnergyUsage)
}
def resetEnergyUsage() {
    log.debug "Daily Energy Meter reset schedule triggered..."
    log.debug "...resetting the energy meter because it's when the user requested it."
    meters?.each { meter->
        log.debug "Reset Energy on (${meter?.getLabel()})"
        meter?.resetEnergyUsage()
    }
    log.debug "Process completed, now schedule the reset to check on the next day."
    initialize()
}
