package com.hops_n_code.dojo.solid.ocp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {
    @InjectMocks
    private Calculator calculator;

    @Mock
    CalculatorOperation mockOperation;

    @Test
    void calculate() {
        calculator.calculate(mockOperation);
    }
}
