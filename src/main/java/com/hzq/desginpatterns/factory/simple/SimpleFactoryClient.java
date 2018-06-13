package com.hzq.desginpatterns.factory.simple;

import com.hzq.desginpatterns.factory.Operation;

/**
 * Created by hzq on 2018/6/12.
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        Operation operation = SimpleOperationFactory.createOperation("pow");
        System.out.println(operation.getResult(1.2d, 2.56d));
    }

}
