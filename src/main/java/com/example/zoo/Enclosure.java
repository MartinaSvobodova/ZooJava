package com.example.zoo;
import java.util.HashMap;
import java.util.Map;

public class Enclosure {
    private int size;
    private int amountOfWater;
    private Map<String, Integer> food;

    public Enclosure(int size){
        this.size = size;
        this.amountOfWater = 0;
        this.food = new HashMap<>();
    }

    public void addWater(int amount){
        this.amountOfWater += amount;
    }

    public void addFood(String food, int amount){
        if (!this.food.containsKey(food)){
            this.food.put(food, 0);
        }
        this.food.put(food, this.food.get(food) + amount);
    }

    public void addFood(Map<String, Integer> foods){
        for (String food : foods.keySet()){
            addFood(food, foods.get(food));
        }
    }
}
