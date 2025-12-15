package org.example.strategy.impl;

import org.example.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking!");
    }
}
