package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

@Builder
public class Car {
    private String brand;
    private String name;
    private String color;
    private Motor motor;
}
