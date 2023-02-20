package org.example;

public class Car {

    public Car() {
        System.out.println("Car is created");
    }

    public void go () {
        System.out.println("Машина едет");
    }

    public void init(){
        System.out.println("Init method");
    }

    public void destroy(){
        System.out.println("Destroy method");
    }
}
