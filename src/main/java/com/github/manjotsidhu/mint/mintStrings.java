/*
 * Copyright (C) 2018, Manjot Sidhu <manjot.techie@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.manjotsidhu.mint;

/**
 * Useful operations for Strings
 *
 * @author Manjot Sidhu
 */
public class mintStrings {

    /**
     * Checks if the string contains <b>all</b> upper case characters in 
     * <code>input</code>.
     * 
     * @param input String on which the operations is to be performed
     * @return Returns the result as boolean (true/false)
     */
    public static boolean isUpper(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Checks if the string contains <b>all</b> lower case characters in 
     * <code>input</code>.
     * 
     * @param input String on which the operations is to be performed
     * @return Returns the result as boolean (true/false)
     */
    public static boolean isLower(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}
