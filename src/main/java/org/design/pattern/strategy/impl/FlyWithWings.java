package org.design.pattern.strategy.impl;

import org.design.pattern.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly(){
        System.out.println("I'm flying!");
    }
}
