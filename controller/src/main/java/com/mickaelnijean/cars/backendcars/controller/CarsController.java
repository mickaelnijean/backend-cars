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
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("black").price(701).build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("red").price(702).isNotAvailable(true).build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model 3").color("blue").price(703).build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("red").price(704).build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("blue").price(705).build(),
                Car.builder().brand("Tesla").motor(Motor.ELECTRIC).name("Model S").color("black").price(706).build(),
                Car.builder().brand("Renault").motor(Motor.DIESEL).name("Clio").color("blue").price(707).build(),
                Car.builder().brand("Renault").motor(Motor.DIESEL).name("Megane").color("red").price(708).build(),
                Car.builder().brand("Renault").motor(Motor.PETROL).name("Clio").color("white").price(709).build()
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
