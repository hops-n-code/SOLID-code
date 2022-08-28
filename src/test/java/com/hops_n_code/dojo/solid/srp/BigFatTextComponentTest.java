package com.hops_n_code.dojo.solid.srp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BigFatTextComponentTest {
    @InjectMocks
    private BigFatTextComponent bigFatTextComponent;

    @Test
    void getText() {
        String result = bigFatTextComponent.getText();
    }

    @Test
    void appendText() {
        bigFatTextComponent.appendText("Hello");
    }

    @Test
    void findWordAndReplace() {
        String result = bigFatTextComponent.findWordAndReplace("Hello", "World");
    }

    @Test
    void findWordAndDelete() {
        String result = bigFatTextComponent.findWordAndDelete("Hello");
    }

    @Test
    void printText() {
        bigFatTextComponent.printText("Hello");
    }
}
