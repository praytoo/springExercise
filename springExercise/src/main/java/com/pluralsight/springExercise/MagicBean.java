package com.pluralsight.springExercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MagicBean extends Bean{
    public MagicBean(String recipe) {
        super(recipe);
    }
}
