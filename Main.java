package com.company;

public class Main {

    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 5, 8,8);

        System.out.println(iPhone.getName());



        iPhone.playMusic("Hells Bells");
        iPhone.playMusic("Lamenting Kiss");

        Phone pixel = new Phone("Pixel XL", 16);

        System.out.println(pixel.getName());
    }
}
