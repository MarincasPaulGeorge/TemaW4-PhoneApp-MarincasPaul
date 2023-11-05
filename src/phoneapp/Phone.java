package phoneapp;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
//    private List<Contacts> historyCalls;
//    private List<Contacts> messageHistory;

    private String model;
    private String color;
    private String material;
    private double batteryLife;

    public Phone(String model, String color, String material, double batteryLife) {
        this.model = model;
        this.color = color;
        this.material = material;
        this.batteryLife = batteryLife;
    }




    public String getModel() {
        return model;
    }

    public void getModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void getColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }
    public void getMaterial(String material) {
        this.material = material;
    }

    public double getBatteryLife() {
        return batteryLife;
    }
    public void getBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    //    List<Contacts> contacts, List<Contacts> historyCalls, List<Contacts> messageHistory,



}