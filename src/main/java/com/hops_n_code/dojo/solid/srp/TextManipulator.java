package com.hops_n_code.dojo.solid.srp;

public interface TextManipulator {
    String getText();

    void appendText(String newText);

    String findWordAndReplace(String word,
                              String replacementWord);

    String findWordAndDelete(String word);
}
