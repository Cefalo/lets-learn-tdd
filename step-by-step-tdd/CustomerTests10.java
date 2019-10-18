/*
 * $
 *
 * Copyright (C) 2019 Cefalo AS.
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Cefalo AS.  This notice must be included on all
 * copies, modifications and derivatives of this work.
 */
package com.cefalo.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author <a href="mailto:fmshaon@gmail.com">Ferdous Mahmud Shaon</a>
 * @author last modified by $
 * @version $ $
 */
/*
 * Customer has following properties:
 * Name: name of the customer, String, Mandatory
 *
 * RewardPoints: the total reward points of a customer, default value: 0, integer
 *               value can only be set >=0, otherwise throws IllegalArgumentException
 *
 * purchaseGoods(int amount): increase the total RewardPoints count based on the following formula:
 *                            total RewardPoints count += ceil(amount * 0.1)
 *                            the amount cannot be <0, otherwise throw IllegalArgumentException
 *
 * redeemPoints(int points): decrease the total RewardPoints count by the given number of points
 *                          if the given number of points < total RewardPoints count
 *                          otherwise throw IllegalArgumentException
 *
 * */
public class CustomerTests10 {
  private Customer customer;

  @BeforeEach
  public void setUpCustomer() {
    customer = new Customer("Arnab");
  }
  @Test
  public void testCustomerWithNameOnly() {
    assertEquals("Arnab", customer.getName());
  }
  @Test
  public void testCustomerWithRewardPoints() {
    customer.setRewardPoints(100);
    assertEquals(100, customer.getRewardPoints());
  }
  @Test
  public void testCustomerWithDefaultRewardPoints() {
    assertEquals(0, customer.getRewardPoints());
  }
  @Test
  public void testCustomerWithNegativeRewardPoints() {
    assertThrows(IllegalArgumentException.class, () -> customer.setRewardPoints(-10));
  }
  @Test
  public void testCustomerWithPurchaseGoods() {
    customer.setRewardPoints(100);
    customer.purchaseGoods(200);
    assertEquals(120,customer.getRewardPoints());
  }
  @Test
  public void testCustomerWithPurchaseGoods_CeilRewardPoints() {
    customer.setRewardPoints(100);
    customer.purchaseGoods(244);
    assertEquals(125,customer.getRewardPoints());
  }
  @Test
  public void testCustomerWithPurchaseGoods_invalidAmount() {
    customer.setRewardPoints(100);
    assertThrows(IllegalArgumentException.class, () -> customer.purchaseGoods(-244));
  }
  @Test
  public void testCustomerRedeemPoints() {
    customer.setRewardPoints(200);
    customer.redeemPoints(50);
    assertEquals(150, customer.getRewardPoints());
  }
}
