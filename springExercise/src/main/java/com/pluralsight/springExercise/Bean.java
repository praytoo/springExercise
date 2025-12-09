package com.pluralsight.springExercise;

public abstract class Bean {
    private String recipe;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Bean(String recipe) {
        this.recipe = recipe;
    }
}
