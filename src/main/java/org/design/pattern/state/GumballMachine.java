package org.design.pattern.state;

public class GumballMachine {

  private State noCoinState;
  private State hasCoinState;
  private State soldState;

  private State currentState;

  public GumballMachine() {
    noCoinState = new NoCoinState(this);
    hasCoinState = new HasCoinState(this);
    soldState = new SoldState(this);

    currentState = noCoinState;
  }

  public void insertCoin() {
    currentState.insertCoin();
  }

  public void ejectCoin() {
    currentState.ejectCoin();
  }

  public void turnCrank() {
    currentState.turnCrank();
    currentState.dispense();
  }

  // setters & getters
  public void setState(State state) {
    this.currentState = state;
  }

  public State getNoCoinState() { return noCoinState; }
  public State getHasCoinState() { return hasCoinState; }
  public State getSoldState() { return soldState; }
}

