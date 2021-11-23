/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package org.example;

/**
 * @author dongyy
 * @version : MathServiceImpl.java, v 0.1 2021年11月23日 11:36 dongyy Exp $
 */
public class MathServiceImpl implements MathService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }
}