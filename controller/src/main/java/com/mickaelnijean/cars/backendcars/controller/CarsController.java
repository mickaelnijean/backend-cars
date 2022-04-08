package com.mickaelnijean.cars.backendcars.controller;

import com.mickaelnijean.cars.backendcars.model.*;
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
                ElectricCar.builder().brand("Tesla").name("Model 3").color("red").price(100).build(),
                ElectricCar.builder().brand("Tesla").name("Model 3").color("red").price(101).build(),
                ElectricCar.builder().brand("Tesla").name("Model 3").color("blue").price(102).build(),
                ElectricCar.builder().brand("Tesla").name("Model S").color("red").price(103).build(),
                ElectricCar.builder().brand("Tesla").name("Model S").color("blue").price(104).build(),
                ElectricCar.builder().brand("Tesla").name("Model S").color("black").price(105).build(),
                DieselCar.builder().brand("Renault").name("Clio").color("blue").price(106).build(),
                DieselCar.builder().brand("Renault").name("Megane").color("red").price(107).build(),
                PetrolCar.builder().brand("Renault").name("Clio").color("white").price(108).build()
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
