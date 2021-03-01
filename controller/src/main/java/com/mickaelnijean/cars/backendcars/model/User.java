package com.mickaelnijean.cars.backendcars.model;

import lombok.Builder;

@Builder
public class User {
    private String name;
    private Preference preference;
}
