package org.example;

public class Person {

    private Car car;

    public void side() {
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
