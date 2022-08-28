package com.hops_n_code.dojo.solid.ocp;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        operation.perform();
    }
}
