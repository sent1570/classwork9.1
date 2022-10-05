package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public String getInfo() {
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter Name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
