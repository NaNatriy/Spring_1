package org.example.menu;

import org.example.menu.Car;
import org.example.menu.Moto;
import org.example.menu.Person;
import org.example.menu.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    public Transport newTransport() {
        return new Car();
    }
    @Bean
    public Person newPerson() {
        return new Person(newTransport());
    }

}
