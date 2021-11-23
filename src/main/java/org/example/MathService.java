/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package org.example;

/**
 * @author dongyy
 * @version : MathService.java, v 0.1 2021年11月23日 11:36 dongyy Exp $
 */
public interface MathService {

    /**
     * 加
     *
     * @param a
     * @param b
     * @return
     */
    int add(int a, int b);

    /**
     * 减
     *
     * @param a
     * @param b
     * @return
     */
    int subtract(int a, int b);

    /**
     * 乘
     *
     * @param a
     * @param b
     * @return
     */
    int multiply(int a, int b);

    /**
     * 除
     *
     * @param a
     * @param b
     * @return
     */
    int divide(int a, int b);
}