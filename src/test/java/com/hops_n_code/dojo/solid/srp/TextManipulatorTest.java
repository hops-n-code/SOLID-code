package com.hops_n_code.dojo.solid.srp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TextManipulatorTest {
    @InjectMocks
    private TextManipulator textManipulator;

    @Test
    void getText() {
        String result = textManipulator.getText();
    }

    @Test
    void appendText() {
        textManipulator.appendText("Hello");
    }

    @Test
    void findWordAndReplace() {
        String result = textManipulator.findWordAndReplace("Hello", "World");
    }

    @Test
    void findWordAndDelete() {
        String result = textManipulator.findWordAndDelete("Hello");
    }
}
