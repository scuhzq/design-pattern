package com.hzq.desginpatterns.factory.simple;

import com.hzq.desginpatterns.factory.Operation;

/**
 * Created by hzq on 2018/6/12.
 */
public class SimpleOperationFactory {

    /**
     * 简单工厂模式最大的优点，工厂类中包含了必要的逻辑判断，根据客户端的参数，选择实例化的类。
     * 如果需要增加新的 power 运算，需要修改工厂类。违反了 开闭原则
     */
    public static Operation createOperation(String ops){
        Operation operation = null;
        switch (ops){
        case "+":
            operation = new AddOperation();
            break;
        case "-":
            operation = new SubstractOperation();
            break;
        case "*":
            operation = new MultipleOperation();
            break;
        case "/":
            operation = new DivideOperation();
            break;
        //需要修改简单工厂类，违反了开闭原则
        case "pow":
            operation = new PowerOperation();
        }

        return operation;
    }

}
