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

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class StringHelperTests {
  /*
  * Truncate A if it is present in the first two characters of a String
  * Sample input and Output:
  * "BCDE" => "BCDE"
  * "ABCD" => "BCD"
  * "AACD" => "CD"
  * "BACD" => "BCD"
  * "AAAA" => "AA"
  * "MNAA" => "MNAA"
  * "A" => ""
  * ""  => ""
  */
  @Test
  public void testTruncateFirst2As_ANotPresent() {
    assertEquals("BCDE", StringHelper.truncateFirst2As("BCDE"));
  }

  @Test
  public void testTruncateFirst2As_AInFirstCharOnly() {
    assertEquals("BCD", StringHelper.truncateFirst2As("ABCD"));
  }

  @Test
  public void testTruncateFirst2As_AInFirstTwoCharsOnly() {
    assertEquals("CD", StringHelper.truncateFirst2As("AACD"));
  }

  @Test
  public void testTruncateFirst2As_AInSecondCharOnly() {
    assertEquals("BCD", StringHelper.truncateFirst2As("BACD"));
  }

  @Test
  public void testTruncateFirst2As_AInAllChars() {
    assertEquals("AA", StringHelper.truncateFirst2As("AAAA"));
  }

  @Test
  public void testTruncateFirst2As_ANotInFirstTwoChars() {
    assertEquals("MNAA", StringHelper.truncateFirst2As("MNAA"));
  }

  @Test
  public void testTruncateFirst2As_AInOneCharString() {
    assertEquals("", StringHelper.truncateFirst2As("A"));
  }

  @Test
  public void testTruncateFirst2As_EmptyString() {
    assertEquals("", StringHelper.truncateFirst2As(""));
  }

  /*
   * Swap tbe last two characters of a String
   * Sample input and Output:
   * "AB" => "BA"
   * "ABCD" => "ABDC"
   * "AACDEFGHIJ" => "AACDEFGHJI"
   * "A => "A"
   * "" => ""
   */

  @Test
  public void testSwapLastTwoChars_TwoCharOnlyString() {
    assertEquals("BA", StringHelper.swapLastTwoChars("AB"));
  }
  @Test
  public void testSwapLastTwoChars_MoreThanTwoCharString() {
    assertEquals("ABDC", StringHelper.swapLastTwoChars("ABCD"));
  }
  @Test
  public void testSwapLastTwoChars_LargeString() {
    assertEquals("AACDEFGHJI", StringHelper.swapLastTwoChars("AACDEFGHIJ"));
  }
  @Test
  public void testSwapLastTwoChars_OneCharString() {
    assertEquals("A", StringHelper.swapLastTwoChars("A"));
  }
  @Test
  public void testSwapLastTwoChars_EmptyString() {
    assertEquals("", StringHelper.swapLastTwoChars(""));
  }
}
