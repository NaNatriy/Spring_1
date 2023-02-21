package org.example.menu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Car implements Transport {
    @Override
    public void go() {
        System.out.println("Машина едет");
    }
    @PostConstruct
    public void init() {
        System.out.println("Метод init - car");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Метод destroy - car");
    }
}
