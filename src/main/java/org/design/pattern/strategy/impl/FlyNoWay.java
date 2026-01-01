package org.design.pattern.strategy.impl;

import org.design.pattern.strategy.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
