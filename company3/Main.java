package com.company;

public class Main {

    public static void main(String[] args) {
//        Car mercedes = new Car( "Mercedes", 2, "White", new Engine("AMG", 8000) );
//        System.out.println(mercedes.getName());
//        Engine engine = mercedes.getEngine();
//
//        System.out.println("Engine Model: " + mercedes.getEngine().getModel());

//        Car mercedes = null;
//        if(mercedes != null){
//            mercedes.getName();
//        }else {
//            System.out.println("The car is null");
//        }

//        final int a = 5;
//        a = a+1;

        final Engine engine = new Engine("AMG", 7000);
        engine.setRpm(10000);


    }
}
