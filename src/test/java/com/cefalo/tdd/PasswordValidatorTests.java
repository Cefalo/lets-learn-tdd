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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class PasswordValidatorTests {
  /*
  * Definition of  valid password
  *   - Min Length: 6 characters
  *   - Max Length: 12 characters
  *   - Must have at least 1 lowercase character
  *   - Must have at least 1 uppercase character
  *   - Must have at least 1 numeric character
  *   - Must have at least 1 of these special characters (!, @, #, $, %, ^, &)
  */
  @Test
  public void testSmallerLengthPassword() {
    assertFalse(PasswordValidator.isValidPassword("abc12"));
  }

  @Test
  public void testBiggerLengthPassword() {
    assertFalse(PasswordValidator.isValidPassword("abcdefg123456"));
  }

  @Test
  public void testUpperCaseOnlyPassword() {
    assertFalse(PasswordValidator.isValidPassword("ABCDEF"));
  }

  @Test
  public void testLowerCaseOnlyPassword() {
    assertFalse(PasswordValidator.isValidPassword("abcdef"));
  }

  @Test
  public void testAlphabetOnlyPassword() {
    assertFalse(PasswordValidator.isValidPassword("abcDEF"));
  }

  @Test
  public void testAlphaNumericOnlyPassword() {
    assertFalse(PasswordValidator.isValidPassword("abcDEF123"));
  }

  @Test
  public void testLowerCaseMissingPassword() {
    assertFalse(PasswordValidator.isValidPassword("ABC@DEF123"));
  }

  @Test
  public void tesInvalidSpecialCharPassword() {
    assertFalse(PasswordValidator.isValidPassword("abc)@DEF123"));
  }

  @Test
  public void testValidPassword() {
    assertTrue(PasswordValidator.isValidPassword("abc@DEF123"));
  }

}
