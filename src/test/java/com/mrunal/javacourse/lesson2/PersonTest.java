package com.mrunal.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld () {
        Person mrunal = new Person();
        assertEquals("Hello World", mrunal.helloWorld());
    }

    @Test
    public void shouldReturnHelloMrunal() {
        Person person = new Person();
        //Person person2 = new Person();
        assertEquals("Hello World", person.hello("World"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person myPerson;
        for (int i = 0; i < 4; i++) {
            myPerson =new Person();;
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        boolean monday = true;
        boolean raining = true;
        boolean thuesday = false;
        boolean sunny = false;
        if ((monday && raining) || (thuesday && sunny)) {
            drinkBeer();
        }
    }

    private void drinkBeer() {
    }
}





