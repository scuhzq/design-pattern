package com.hzq.desginpatterns.factory.simple;

import com.hzq.desginpatterns.factory.Operation;

import java.math.BigDecimal;

/**
 * Created by hzq on 2018/6/12.
 */
public class AddOperation implements Operation{

    public double getResult(Number a, Number b) {
        BigDecimal b1 = new BigDecimal(String.valueOf(a));
        BigDecimal b2 = new BigDecimal(String.valueOf(b));
        return b1.add(b2).doubleValue();
    }
}
