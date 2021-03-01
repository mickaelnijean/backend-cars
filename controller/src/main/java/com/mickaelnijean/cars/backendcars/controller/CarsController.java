package com.mickaelnijean.cars.backendcars.controller;

import com.mickaelnijean.cars.backendcars.model.Car;
import com.mickaelnijean.cars.backendcars.model.Motor;
import com.mickaelnijean.cars.backendcars.model.Preference;
import com.mickaelnijean.cars.backendcars.model.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarsController {
    
    public List<Car> getAllCarsController() {
        return this.mockCarsDatabase();
    }
    
    public List<Car> mockCarsDatabase() {
        return Arrays.asList(
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("red").build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("red").build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("blue").build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("red").build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("blue").build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("black").build(),
                Car.builder().brand("Renault").motor(Motor.DIESEL).name("Clio").color("blue").build(),
                Car.builder().brand("Renault").motor(Motor.DIESEL).name("Megane").color("red").build(),
                Car.builder().brand("Renault").motor(Motor.PETROL).name("Clio").color("white").build()
        );
    }
    
    public List<User> mockUsersDatabase(){
        Preference pierresPreferences = Preference.builder().motor(Motor.DIESEL).build();
        Preference paulPreferences = Preference.builder().motor(Motor.ELECTRIC).color("blue").build();
        return Arrays.asList(
                User.builder().name("Pierre").preference(pierresPreferences).build(),
                User.builder().name("Paul").preference(paulPreferences).build(),
                User.builder().name("Jacques").preference(Preference.NONE).build()
        );
    }
    
}
