package com.pluralsight.springExercise;

import org.springframework.stereotype.Component;

@Component
public class Spell {
    protected String description = "Love Spell";

    public Spell(String spell) {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
