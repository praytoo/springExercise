package com.pluralsight.springExercise;

import org.springframework.stereotype.Component;

@Component
public class BeanSoup {
    private Bean recipe;

    public Bean getRecipe() {
        return recipe;
    }

    public void setRecipe(Bean recipe) {
        this.recipe = recipe;
    }

    public BeanSoup(Bean recipe) {
        this.recipe = recipe;
    }
}
