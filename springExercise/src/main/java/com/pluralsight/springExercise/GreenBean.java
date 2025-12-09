package com.pluralsight.springExercise;

import org.springframework.stereotype.Component;

@Component
public class GreenBean extends Bean{
    public GreenBean(String recipe) {
        super(recipe);
    }
}
