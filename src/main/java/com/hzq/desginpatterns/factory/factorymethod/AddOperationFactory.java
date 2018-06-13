package com.hzq.desginpatterns.factory.factorymethod;

import com.hzq.desginpatterns.factory.Operation;
import com.hzq.desginpatterns.factory.simple.AddOperation;

/**
 * Created by hzq on 2018/6/12.
 */
public class AddOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
