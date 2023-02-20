package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Car car = context.getBean("CarGo", Car.class);
        car.go();

        context.close();
    }
}
