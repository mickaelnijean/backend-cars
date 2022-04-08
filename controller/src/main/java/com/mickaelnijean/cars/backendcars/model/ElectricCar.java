package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

public class ElectricCar extends Car{
    
    @Builder
    public ElectricCar(String brand, String name, String color, int price){
        super(brand,name,color,Motor.ELECTRIC, price);
    }
}
