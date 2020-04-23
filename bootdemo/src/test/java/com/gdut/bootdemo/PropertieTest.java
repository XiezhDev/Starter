package com.gdut.bootdemo;

import com.gdut.bootdemo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PropertieTest {
    @Autowired
    Person person;

    @Test
    public void test1() {
        System.out.println(person);
    }
}
