package org.design.pattern.state;

public class SoldState implements State {

  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertCoin() {
    System.out.println("Please wait, dispensing");
  }

  public void ejectCoin() {
    System.out.println("Already turned crank");
  }

  public void turnCrank() {
    System.out.println("Turning twice does nothing");
  }

  public void dispense() {
    System.out.println("Gumball dispensed 🎉");
    gumballMachine.setState(gumballMachine.getNoCoinState());
  }
}

