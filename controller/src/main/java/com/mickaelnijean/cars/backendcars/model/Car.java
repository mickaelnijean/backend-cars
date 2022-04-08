package com.mickaelnijean.cars.backendcars.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
    protected String brand;
    protected String name;
    protected String color;
    protected Motor motor;
    protected int price;
}
