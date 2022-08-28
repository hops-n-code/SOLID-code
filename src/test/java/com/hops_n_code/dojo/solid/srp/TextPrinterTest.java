package com.hops_n_code.dojo.solid.srp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TextPrinterTest {
    @InjectMocks
    private TextPrinter textPrinter;

    @Test
    void printText() {
        textPrinter.printText("Hello");
    }

    @Test
    void printOutByWord() {
        textPrinter.printOutByWord("Hello World");
    }

    @Test
    void printRangeOfCharacters() {
        textPrinter.printRangeOfCharacters("Hello World", 0, 5);
    }
}
