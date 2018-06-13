package com.hzq.desginpatterns.factory.factorymethod;

import com.hzq.desginpatterns.factory.Operation;
import com.hzq.desginpatterns.factory.simple.MultipleOperation;

/**
 * Created by hzq on 2018/6/12.
 */
public class MultipleOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new MultipleOperation();
    }
}
