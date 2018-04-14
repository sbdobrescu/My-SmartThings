/* 
 * Routine Maker - from the creators of EchoSistant  
 *
 *	12/07/2017		Version:1.0 R.0.0.2		Bug fixes and addition of new triggers
 *	11/27/2017		Version:1.0 R.0.0.1		initial release
 *
 *
 *  Copyright 2017 Jason Headley, Bobby Dobrescu
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
/**********************************************************************************************************************************************/
definition(
    name		: "Routines Maker",
    namespace		: "jasonrwise77",
    author		: "jasonrwise77"/* 
 * Routine Maker - from the creators of EchoSistant  
 *
 *	12/07/2017		Version:1.0 R.0.0.2		Bug fixes and addition of new triggers
 *	11/27/2017		Version:1.0 R.0.0.1		initial release
 *
 *
 *  Copyright 2017 Jason Headley, Bobby Dobrescu
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
/**********************************************************************************************************************************************/
definition(
    name		: "Routine Maker",
    namespace	: "Assistant",
    author		: "JH/BD",
    description	: "A SmartApp to bring out the power of your home",
    category	: "My Apps",
	iconUrl			: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant.png",
	iconX2Url		: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant@2x.png",
	iconX3Url		: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant@2x.png")

/**********************************************************************************************************************************************/
private def textVersion() {
	def text = "1.0"
}
private release() {
    def text = "Ver R.0.0.1 13-Apr-2018"
}
/**********************************************************************************************************************************************/

preferences {
    page(name: "main")
    }
page name: "main"
    def main() {
    	dynamicPage (name: "main", title: "You have created (${childApps?.size()}) Routines", install: true, uninstall: true) {
    		section("",  uninstall: false){
    		app(name: "Routine", appName: "Routine", title: "Create a new Routine", namespace: "Assistant", multiple: true,  uninstall: false)
    		}
        section("",  uninstall: false){
    	input "debug", "bool", title: "Enable Debug Logging", default: true, submitOnChange: true
    	paragraph ("Parent App Version: ${textVersion()} | Release: ${release()}")
    	}
    }
}       
/************************************************************************************************************
		Base Process
************************************************************************************************************/
def installed() {
	if (debug) log.debug "Installed with settings: ${settings}"
    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
    //    state.ParentRelease = release()
    initialize()
}
def updated() { 
	if (debug) log.debug "Updated with settings: ${settings}"
    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
    unsubscribe()
    initialize()
}
def initialize() {
        //Other Apps Events
        state.esEvent = [:]
}",
    description	: "A SmartApp to bring out the power of your home",
    category	: "My Apps",
	iconUrl			: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant.png",
	iconX2Url		: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant@2x.png",
	iconX3Url		: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-Echosistant@2x.png")

/**********************************************************************************************************************************************/
private def textVersion() {
	def text = "1.0"
}
private release() {
    def text = "Ver R.0.0.1 13-Apr-2018"
}
/**********************************************************************************************************************************************/

preferences {
    page(name: "main")
    }
page name: "main"
    def main() {
    	dynamicPage (name: "main", title: "You have created (${childApps?.size()}) Routines", install: true, uninstall: true) {
    		section("",  uninstall: false){
    		app(name: "Routine", appName: "Routine", title: "Create a new Routine", namespace: "Assistant", multiple: true,  uninstall: false)
    		}
        section("",  uninstall: false){
    	input "debug", "bool", title: "Enable Debug Logging", default: true, submitOnChange: true
    	paragraph ("Parent App Version: ${textVersion()} | Release: ${release()}")
    	}
    }
}       
/************************************************************************************************************
		Base Process
************************************************************************************************************/
def installed() {
	if (debug) log.debug "Installed with settings: ${settings}"
    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
    //    state.ParentRelease = release()
    initialize()
}
def updated() { 
	if (debug) log.debug "Updated with settings: ${settings}"
    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
    unsubscribe()
    initialize()
}
def initialize() {
        //Other Apps Events
        state.esEvent = [:]
}
