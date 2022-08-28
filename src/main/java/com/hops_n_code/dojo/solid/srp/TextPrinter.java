package com.hops_n_code.dojo.solid.srp;

public interface TextPrinter {
    void printText(String text);

    void printOutByWord(String text);

    void printRangeOfCharacters(String text,
                                int startingIndex,
                                int endIndex);
}
