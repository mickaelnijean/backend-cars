package com.mickaelnijean.cars.backendcars.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Preference {
    public static final Preference NONE = new Preference();
    private String color;
    private Motor motor;
}
