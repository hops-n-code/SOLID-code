package com.hops_n_code.dojo.solid.dip;

import lombok.Data;

@Data
public class ShinyComputer {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public ShinyComputer() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new StandardMonitor();
    }
}
