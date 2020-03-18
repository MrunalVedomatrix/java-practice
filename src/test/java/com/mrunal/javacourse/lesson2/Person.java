package com.mrunal.javacourse.lesson2;

import com.mrunal.javacourse.lesson3.Name;

public class Person {
    private static int personCounter;
    private Name personName;

    public Person (Name personName) {
        this.personName = personName;
    }

    public Person () {
        personCounter++;
        /* empty on purpose - default constructor*/
    }

    public String helloWorld() {
        return "Hello World";
    }
    public Name name() {
        return  personName;
    }
    public String hello(String name) {
        return  "Hello "+name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
