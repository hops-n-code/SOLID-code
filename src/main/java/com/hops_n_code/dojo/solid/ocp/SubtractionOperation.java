package com.hops_n_code.dojo.solid.ocp;

import lombok.Data;

@Data
public class SubtractionOperation implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        result = left - right;
    }
}
