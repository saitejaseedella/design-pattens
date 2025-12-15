package org.example.strategy;

public class MallardDuck extends Duck {


    public MallardDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {

    }
}
