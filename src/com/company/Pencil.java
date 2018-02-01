package com.company;

public class Pencil {

    private double LeadSize;

    private String brand;

    private boolean HasEraser;
    private String color;

    public double getLeadSize() {
        return LeadSize;
    }

    public void setLeadSize(double leadSize) {
        LeadSize = leadSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasEraser() {
        return HasEraser;
    }

    public void setHaseEaser(boolean HasEraser) {
        HasEraser = HasEraser;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMechanical() {
        return Mechanical;
    }

    public void setMechanical(boolean mechanical) {
        Mechanical = mechanical;
    }

    private boolean Mechanical;
}
