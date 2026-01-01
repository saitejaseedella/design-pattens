package org.design.pattern.strategy;

// Duck.java
public abstract class Duck {

    protected FlyBehaviour flyBehavior;
    protected QuackBehaviour quackBehavior;

    public Duck(FlyBehaviour flyBehavior, QuackBehaviour quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehaviour flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehaviour quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // let each duck subclass define how it looks
    public abstract void display();
}
