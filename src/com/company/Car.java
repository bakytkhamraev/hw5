package com.company;

public class Car {
    int year;
    String color;
    double volume;
    Chair chair;

    public Car (int year, String c, double volume){
        this.year = year;
        color = c;
        this.volume = volume;
    }

    public Car (){}

    public Car (int year, double volume){
        this.year = year;
        this.volume = volume;
    }

    public void makeBeep(){
        System.out.println("Beeeeeeep");
    }

    public void makeBeep(String beepSound){
        System.out.println(beepSound);
    }
}
