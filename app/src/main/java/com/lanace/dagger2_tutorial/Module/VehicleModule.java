package com.lanace.dagger2_tutorial.Module;

import com.lanace.dagger2_tutorial.model.Motor;
import com.lanace.dagger2_tutorial.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lanace on 2017. 1. 6..
 */

@Module
public class VehicleModule {
  @Provides @Singleton
  Motor provideMotor(){
    return new Motor();
  }

  @Provides @Singleton
  Vehicle provideVehicle(){
    return new Vehicle(new Motor());
  }
}
