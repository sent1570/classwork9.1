package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    public  String getInfo() {
              return super.getInfo() +  "\nName: " + getName() +
                "\nBreed: " + getBreed() +
                "\nCommands: " + (commands == null ? "No commands " : Arrays.toString(commands) );
    }
    void makeVoice (String voice,int count ) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }
    void makeVoice (String voice){
        System.out.println(voice);

    }
    void makeVoice (int count,String voice){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    public Dog(String name,String breed,Color color,String[] commands,Shelter shelter){
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public Dog (String name, String breed, String[] commands, Color color, Shelter shelter){
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }
    public Dog(String name,String breed,Color color,Shelter shelter){
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }
    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
