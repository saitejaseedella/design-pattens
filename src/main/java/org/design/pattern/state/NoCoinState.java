package org.design.pattern.state;
public class NoCoinState implements State {

  private GumballMachine gumballMachine;

  public NoCoinState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertCoin() {
    System.out.println("Coin inserted");
    gumballMachine.setState(gumballMachine.getHasCoinState());
  }

  public void ejectCoin() {
    System.out.println("No coin to eject");
  }

  public void turnCrank() {
    System.out.println("Insert coin first");
  }

  public void dispense() {
    System.out.println("Pay first");
  }
}
