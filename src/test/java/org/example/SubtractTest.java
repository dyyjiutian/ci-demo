/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author dongyy
 * @version : SubtractTest.java, v 0.1 2021年11月23日 11:42 dongyy Exp $
 */
@Test
public class SubtractTest {

    private MathService mathService;

    @BeforeClass
    public void setUp() {
        mathService = new MathServiceImpl();
    }

    public void testSubtract() {
        int result = mathService.subtract(3, 5);
        Assert.assertEquals(result, -2);
    }
}