package com.wipro.automobile.ship;
public class Compartment {
    private double height;
    private double width;
    private double breadth;
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    @Override
    public String toString() {
        return "Compartment [Height=" + height + ", Width=" + width + ", Breadth=" + breadth + "]";
    }
       public static void main(String[] args) {
        Compartment myCompartment = new Compartment(12.5, 25.0, 40.2);
        System.out.println(myCompartment.toString());
    }
}
