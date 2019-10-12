package com.company;

public class Chair {
    private double height;
    private String material;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("Высота не может быть отрицательной");
        } else {
            this.height = height;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private String defaultMaterial(){
        return "Leather";
    }
}
