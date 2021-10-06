package com.crackersmachine;
import java.util.List;
import java.util.ArrayList;

public abstract class CrackerBuilder {
        String name;
        List<String> ingredients = new ArrayList<String>();
        
        public abstract CrackerBuilder addCheese();
        public abstract CrackerBuilder addBakingSoda();
        public abstract CrackerBuilder addOil();
        public Cracker build() {
            Cracker cracker = new Cracker();
            cracker.setName(this.name);
            return cracker;
        }
    }
    
