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
public class SimpleCalculator {
  public double add(final double pNumber1, final double pNumber2) {
    return pNumber1 + pNumber2;
  }

  public double divide(final double pDividend, final double pDivisor) {
    if(pDivisor==0) {
      throw new IllegalArgumentException("Divisor cannot be 0");
    }
    return pDividend / pDivisor;
  }
}
