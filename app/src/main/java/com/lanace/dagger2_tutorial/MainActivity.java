package com.lanace.dagger2_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lanace.dagger2_tutorial.Component.DaggerVehicleComponent;
import com.lanace.dagger2_tutorial.Component.VehicleComponent;
import com.lanace.dagger2_tutorial.Module.VehicleModule;
import com.lanace.dagger2_tutorial.model.Vehicle;

public class MainActivity extends AppCompatActivity {

  Vehicle vehicle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    VehicleComponent component = DaggerVehicleComponent
        .builder()
        .vehicleModule(new VehicleModule())
        .build();

    vehicle = component.provideVehicle();
    Toast.makeText(this, "Speed: " + vehicle.getSpeed(), Toast.LENGTH_SHORT).show();
  }
}
