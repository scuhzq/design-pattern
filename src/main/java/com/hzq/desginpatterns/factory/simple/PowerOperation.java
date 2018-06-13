package com.hzq.desginpatterns.factory.simple;

import com.hzq.desginpatterns.factory.Operation;

import java.math.BigDecimal;

/**
 * Created by hzq on 2018/6/12.
 */
public class PowerOperation implements Operation{

    @Override
    public double getResult(Number a, Number b) {
        BigDecimal b1 = new BigDecimal(String.valueOf(a));
        BigDecimal b2 = new BigDecimal(String.valueOf(b));
        return b1.pow(b2.intValue()).doubleValue();
    }
}
