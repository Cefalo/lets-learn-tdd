/*
 * $Header$
 *
 * Copyright (C) 2019 Cefalo AS.
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Cefalo AS.  This notice must be included on all
 * copies, modifications and derivatives of this work.
 */
package com.cefalo.tdd;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class PasswordValidator {
  /*
   * Definition of  valid password
   *   - Min Length: 6 characters
   *   - Max Length: 12 characters
   *   - Must have at least 1 lowercase character
   *   - Must have at least 1 uppercase character
   *   - Must have at least 1 numeric character
   *   - Must have at least 1 of these special characters (!, @, #, $, %, ^, &)
   */

  public static boolean isValidPassword(final String pPassword) {
    if(pPassword.length()<6 || pPassword.length()>12) {
      return false;
    }

    boolean hasLowerCaseCharacter = false;
    boolean hasUpperCaseCharacter = false;
    boolean hasNumericCharacter = false;
    boolean hasSpecialCharacter = false;
    final List<Character> specialCharacters = Arrays.asList('!', '@', '#', '$', '%', '^', '&');

    for(int i=0;i<pPassword.length();i++) {
      char currentChar = pPassword.charAt(i);
      if(Character.isLowerCase(currentChar) && !hasLowerCaseCharacter) {
        hasLowerCaseCharacter = true;
      }
      if(Character.isUpperCase(currentChar) && !hasUpperCaseCharacter) {
        hasUpperCaseCharacter = true;
      }
      if(Character.isDigit(currentChar) && !hasNumericCharacter) {
        hasNumericCharacter = true;
      }

      /* character is not lower / uppercase character, not digit */
      if(!Character.isLowerCase(currentChar) && !Character.isUpperCase(currentChar) && !Character.isDigit(currentChar)) {
        if(specialCharacters.contains(currentChar) && !hasSpecialCharacter) {
          hasSpecialCharacter = true;
        }
        else {
          /* current character is not an allowed special character */
          return false;
        }
      }

      if(hasLowerCaseCharacter && hasUpperCaseCharacter && hasNumericCharacter && hasSpecialCharacter) {
        return true;
      }
    }

    return false;
  }
}
