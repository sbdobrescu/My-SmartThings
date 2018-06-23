/**
 *  Fan Guru
 *
 *  Copyright 2016, 2017 Thomas Lawson
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
    name: "Fan Guru",
    namespace: "LawsonAutomation",
    author: "Tom Lawson",
    description: "Turns ceiling fans on when too warm, and off when comfortable or away. " + 
    			 "Motion sensors can be added to also turn ceiling fans off when not in the room. " + 
                 "Install separate instances of Ceiling Fan Guru when rooms have different mode or motion sensor requirements.",
    category: "Green Living",
    iconUrl: "https://raw.githubusercontent.com/lawsonautomation/icons/master/guru-60.png",
    iconX2Url: "https://raw.githubusercontent.com/lawsonautomation/icons/master/guru-120.png",
    iconX3Url: "https://raw.githubusercontent.com/lawsonautomation/icons/master/guru-120.png")

/**********************************************************************************************************************************************/
preferences {
 
