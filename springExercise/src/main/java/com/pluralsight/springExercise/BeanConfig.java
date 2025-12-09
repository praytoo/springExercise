package com.pluralsight.springExercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Qualifier
    @Bean
    public Spell spellDescription(){
        return new Spell("Love Spell");
    }
    @Bean
    public String spellDescription2(){
        return "2nd Love Spell";
    }
}
