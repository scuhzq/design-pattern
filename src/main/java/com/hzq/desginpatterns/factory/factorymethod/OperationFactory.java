package com.hzq.desginpatterns.factory.factorymethod;

import com.hzq.desginpatterns.factory.Operation;

/**
 * Created by hzq on 2018/6/12.
 */
public interface OperationFactory {
    /**
     *  由于工厂类与分支耦合， 抽象出一个接口。将对简单工厂类的修改转化为 增加相应的运算类和工厂类即可。
     */
    Operation createOperation();
}
