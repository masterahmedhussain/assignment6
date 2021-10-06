package com.crackersmachine;

public class DispensedState implements CrackerState {
    CrackerVendingMachine machine;

    public DispensedState(CrackerVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void dispense() {
     
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
            machine.setCount(machine.getCount() - 1);
        } else {
            System.out.println("No crackers available");
            machine.setState(machine.getNoCrackerState());
        }
    }
    @Override 
    public void ritzCracker(){
        CrackerBuilder ritzCrackerBuilder = new RtizCrackerBuilder();
    
        Cracker ritzCracker = ritzCrackerBuilder.addCheese().build();
        ritzCracker.prepare();
        ritzCracker.addSalt();
        ritzCracker.bake();
        ritzCracker.cut();
        ritzCracker.pack();
        System.out.println("Ritz Cracker is ready");
    }


    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "DispensedState";
    }
}
