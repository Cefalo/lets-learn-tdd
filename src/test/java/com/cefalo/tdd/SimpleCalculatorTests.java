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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $Author$
 * @version $Revision$ $Date$
 */
public class SimpleCalculatorTests {
  private static SimpleCalculator simpleCalculator;

  @BeforeAll
  public static void setupSimpleCalculator() {
    simpleCalculator = new SimpleCalculator();
  }

  @Test
  public void testAddition() {
    assertEquals(5, simpleCalculator.add(2,3) );
  }

  @Test
  public void testDivision() {
    assertEquals(5, simpleCalculator.divide(10,2) );
  }

  @Test
  public void testDivision_zero_divisor() {
    assertThrows(IllegalArgumentException.class,() -> simpleCalculator.divide(10,0));
  }
}



