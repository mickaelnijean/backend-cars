package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

public class DieselCar extends ThermalCar{
    @Builder
    public DieselCar(String brand, String name, String color, int price){
        super(brand,name,color,Motor.DIESEL, price);
    }
}
