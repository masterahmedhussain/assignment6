package com.crackersmachine;

public class RtizCrackerBuilder extends CrackerBuilder {
    public RtizCrackerBuilder() {
        this.name = "RtizCrackerBuilder";
    }

    public CrackerBuilder addCheese() {
        this.ingredients.add("add cheese ");
        return this;
    }

    public CrackerBuilder addOil() {
        this.ingredients.add("add Oil");
        return this;
    }

    @Override
    public CrackerBuilder addBakingSoda() {
       this.ingredients.add("add Baking soda ");
       return this;
    }
}
