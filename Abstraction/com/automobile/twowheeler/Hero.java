package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
    @Override
    public String getModelName() { 
        return "Hero Splendor"; 
    }
    @Override
    public String getRegistrationNumber() { 
        return "AP16AX1234"; 
    }
    @Override
    public String getOwnerName() { 
        return "Bhagavan"; 
    }
    public int getSpeed() {
        return 60;
    }
    public void radio() {
        System.out.println("Radio device controls are now active on the Hero vehicle.");
    }
    public static void main(String[] args) {
        Hero bike = new Hero();
        System.out.println("--- Hero Bike Details ---");
        System.out.println("Model Name: " + bike.getModelName());
        System.out.println("Registration: " + bike.getRegistrationNumber());
        System.out.println("Owner: " + bike.getOwnerName());
        System.out.println("Speed: " + bike.getSpeed() + " km/h");
        bike.radio();
    }
}
