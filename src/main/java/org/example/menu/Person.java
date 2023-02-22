package org.example.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Transport transport;

    public Person(Transport transport) {

    }

//    @Qualifier("car")
    @Autowired
    public void setPerson(Transport transport) {
        this.transport = transport;
    }

    public void side() {
        System.out.println("Владелец сел в транспорт");
        transport.go();
    }
}
