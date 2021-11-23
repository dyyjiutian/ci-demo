/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dongyy
 * @version : MathTest.java, v 0.1 2021年11月23日 11:40 dongyy Exp $
 */
public class AddTest {

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathServiceImpl();
    }

    @Test
    public void testAdd() {
        int total = mathService.add(3, 5);
        Assert.assertEquals(8, total);
    }

}