package com.codedifferently.assessment01.part02;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age =age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this("CatName", 0);
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "meow";
    }
}
