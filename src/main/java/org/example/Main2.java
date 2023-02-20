package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Car car1 = context.getBean("CarGo", Car.class);
        Car car2 = context.getBean("CarGo", Car.class);

        System.out.println(car1 == car2);

        context.close();
    }
}
