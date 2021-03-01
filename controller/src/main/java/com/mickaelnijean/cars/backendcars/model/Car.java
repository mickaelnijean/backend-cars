package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

@Builder
public class Car {
    private String brand;
    private String name;
    private String color;
    private Motor motor;
    private boolean isNotAvailable;
    private long price;
}
