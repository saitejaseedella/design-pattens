package org.design.pattern.state;

public class HasCoinState implements State {

  private GumballMachine gumballMachine;

  public HasCoinState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertCoin() {
    System.out.println("Coin already inserted");
  }

  public void ejectCoin() {
    System.out.println("Coin returned");
    gumballMachine.setState(gumballMachine.getNoCoinState());
  }

  public void turnCrank() {
    System.out.println("Crank turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

  public void dispense() {
    System.out.println("Turn crank to get gumball");
  }
}
