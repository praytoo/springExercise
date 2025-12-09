package com.pluralsight.springExercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreenBean extends Bean{
    public GreenBean(@Value("${greenbean.recipe}") String recipe) {
        super(recipe);
    }
}
