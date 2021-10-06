package com.crackersmachine;

public class CrackerVendingMachineTest {
    public static void main(String[] args) throws Exception {   
      System.out.println("-----Test 1: Testing machine by inserting coin and pressing button and getting the Ritz Cracker");
       CrackerVendingMachine machine=new CrackerVendingMachine(3);
       System.out.println(machine);
       machine.insertCoin();
       System.out.println(machine);
       machine.pressButton();
       System.out.println(machine);
       System.out.println("-----Test 2: Testing machine by pressing button without inserting coin-----");
       CrackerVendingMachine machine2=new CrackerVendingMachine(3);
       System.out.println(machine2);
       machine2.pressButton();
       System.out.println(machine2);
        System.out.println("-----Test 3: Testing machine running out of Crackers-----");
        CrackerVendingMachine machine3=new CrackerVendingMachine(3);
        System.out.println(machine3);
        machine3.insertCoin();
        machine3.pressButton();
        machine3.insertCoin();
        machine3.pressButton();
        machine3.insertCoin();
        machine3.pressButton();
        machine3.refill(10);
        machine3.insertCoin();
        machine3.pressButton();
        System.out.println(machine3);
   }
}