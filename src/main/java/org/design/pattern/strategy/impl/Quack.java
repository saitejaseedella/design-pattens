package org.design.pattern.strategy.impl;

import org.design.pattern.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking!");
    }
}
