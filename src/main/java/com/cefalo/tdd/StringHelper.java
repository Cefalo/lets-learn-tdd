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

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class StringHelper {

  /*
   * Sample Input and Output
   * "BCDE" => "BCDE"
   * "ABCD" => "BCD"
   * "AACD" => "CD"
   * "BACD" => "BCD"
   * "AAAA" => "AA"
   * "MNAA" => "MNAA"*
   * "A" => ""
   * ""  => ""
   */
  public static String truncateFirst2As(final String pInput) {
    if(pInput.length()<2) return pInput.replaceAll("A", "");

    String firstTwoChars = pInput.substring(0,2);
    String remainingChars = pInput.substring(2);
    String output = firstTwoChars.replaceAll("A","").concat(remainingChars);

    return output;
  }

  /*
   * Sample input and Output:
   * "AB" => "BA"
   * "ABCD" => "ABDC"
   * "AACDEFGHIJ" => "AACDEFGHJI"
   * "A => "A"
   * "" => ""
   */
  public static String swapLastTwoChars(final String pInput) {
    final int length = pInput.length();

    if(length<2) return pInput;

    String inputWithoutLastTwoChars = pInput.substring(0,length-2);
    String lastTwoChars = pInput.substring(length-2);
    String reverseLasTwoChars = new StringBuilder(lastTwoChars).reverse().toString();

    return inputWithoutLastTwoChars.concat(reverseLasTwoChars);
  }
}
