package com.example.zoo;

public class Pig extends Mammal{
    private static final String sound = "oink";
    
    @Override
    public String makeSound() {
        return sound;
    }
}
