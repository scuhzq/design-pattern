package com.hzq.desginpatterns.factory.factorymethod;

import com.hzq.desginpatterns.factory.Operation;

/**
 * Created by hzq on 2018/6/12.
 */
public class FactoryMethodClient {

    public static void main(String[] args) {
        OperationFactory operationFactory = new PowerOperationFactory();
        Operation operation = operationFactory.createOperation();
        System.out.println(operation.getResult(1.23d, 2.22d));
    }

}
