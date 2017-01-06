package com.lanace.dagger2_tutorial.Component;

import com.lanace.dagger2_tutorial.Module.VehicleModule;
import com.lanace.dagger2_tutorial.model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Lanace on 2017. 1. 6..
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
  Vehicle provideVehicle();
}
