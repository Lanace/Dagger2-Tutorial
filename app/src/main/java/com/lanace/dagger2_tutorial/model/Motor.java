package com.lanace.dagger2_tutorial.model;

/**
 * Created by Lanace on 2017. 1. 6..
 */

public class Motor {
  private int rpm;

  public Motor() {
    this.rpm = 0;
  }

  public int getRpm() {
    return rpm;
  }

  public void accelerate(int value) {
    rpm = rpm + value;
  }
  public void brake() {
    rpm = 0;
  }
}
