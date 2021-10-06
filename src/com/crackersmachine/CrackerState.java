package com.crackersmachine;


public interface CrackerState {
        void insertCoin();
        void pressButton();
        void dispense();

        //Added new states
        void ritzCracker();
        void refill();
    }
    

