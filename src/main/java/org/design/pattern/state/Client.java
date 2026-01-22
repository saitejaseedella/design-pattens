package org.design.pattern.state;

public class Client {
  public static void main(String[] args) {

    GumballMachine machine = new GumballMachine();

    machine.insertCoin();
    machine.turnCrank();

    machine.insertCoin();
    machine.ejectCoin();
  }
}

