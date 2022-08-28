package com.hops_n_code.dojo.solid.dip;

import lombok.Data;

@Data
public class ShinyDecoupledComputer {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public ShinyDecoupledComputer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
