package com.company;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.year = 2011;
        c1.color = "Black";
        c1.volume = 2.5;
        System.out.println(c1.year + " " +
                c1.color + " " + c1.volume);
        Car c2 = new Car(2018, "Yellow", 3.6);
        System.out.println(c2.year + " " +
                c2.color + " " + c2.volume);

        Car c3 = new Car(2017, "Blue", 3.6);

        Car c4 = new Car(2019, 3.0);
        c4.makeBeep();
        c4.makeBeep("Бииб биииб");

        Chair kreslo = new Chair();
        kreslo.setHeight(- 8.9);
        kreslo.setMaterial("Leather");
        System.out.println(kreslo.getHeight() + " " + kreslo.getMaterial());
        c4.chair = kreslo;

        printChairInfo(c4.chair);
    }

    public static void printChairInfo(Chair ch){
        System.out.println("chair info");
        System.out.println(ch.getHeight() + " " + ch.getMaterial());
    }
}
