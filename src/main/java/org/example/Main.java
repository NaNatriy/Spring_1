package org.example;

import org.example.menu.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Transport car = context.getBean("car", Car.class);
//        Transport car1 = context.getBean("car", Car.class);
//
//        car.go();

//        Transport moto = context.getBean("moto", Moto.class);
//        Transport moto1 = context.getBean("moto", Moto.class);


        Person person = context.getBean("person", Person.class);
        person.side();

        context.close();
    }
}
