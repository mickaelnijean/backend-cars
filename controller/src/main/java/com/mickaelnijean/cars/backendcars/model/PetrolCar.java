package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

public class PetrolCar extends ThermalCar {
    
    @Builder
    public PetrolCar(String brand, String name, String color, int price){
        super(brand,name,color,Motor.PETROL, price);
    }
}
