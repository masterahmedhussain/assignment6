package com.crackersmachine;

import java.util.List;

public class Cracker {
    String name;
    List<String> ingredients;
    
    void addIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

    void prepare() {
        System.out.println("preparing "+ name);
        System.out.println("mixing ingriedients");
        }
    void addSalt() {
        System.out.println("add salt toppings.....");
    }
    void bake() {
        System.out.println("Bake at 300");
    }
    void cut() {
        System.out.println("cut into pieces....");
    }
    void pack() {
        System.out.println("place the crackers in box ");
    }
    public void setName(String name) {
		this.name = name;
	}
    
}
