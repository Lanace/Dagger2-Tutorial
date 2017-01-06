package com.lanace.dagger2_tutorial.model;

import javax.inject.Inject;

/**
 * Created by Lanace on 2017. 1. 6..
 */

public class Vehicle {
  private Motor motor;

  @Inject
  public Vehicle(Motor motor){
    this.motor = motor;
  }

  public void increaseSpeed(int value){
    motor.accelerate(value);
  }

  public void stop(){
    motor.brake();
  }

  public int getSpeed(){
    return motor.getRpm();
  }
}
