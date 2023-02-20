package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Car car = context.getBean("CarGo", Car.class);
//        car.go();

        Person person = context.getBean("PersonCar", Person.class);
        person.side();

        context.close();
    }
}
