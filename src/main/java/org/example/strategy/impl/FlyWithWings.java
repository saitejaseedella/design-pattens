package org.example.strategy.impl;

import org.example.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly(){
        System.out.println("I'm flying!");
    }
}
