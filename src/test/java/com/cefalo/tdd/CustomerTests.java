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
 *                          if the given redeem points > total RewardPoints count, throw IllegalArgumentException
 *
 * */
public class CustomerTests {

}
