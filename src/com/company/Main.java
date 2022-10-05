package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Sonny", "ÓË. ÏÅĞÂÎÌÀÉÑÊÀß 91");
        Dog dog = new Dog("Luna", "GG", Color.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice("Ãàâ",4);
        System.out.println();

        Shelter shelter2 = new Shelter("Animals", "ÓË. ÃÎĞÜÊÎÃÎ");
        Dog dog2 = new Dog("Rex", "Bulldog", new String[] {"Ñèäåòü","Ëåæàòü"},Color.WHITE,shelter2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Ãàâ");
        System.out.println();

        Shelter shelter3 = new Shelter("Pets", "ÓË. ÒÎÊÒÎÃÓËÀ");
        Dog dog3 = new Dog("Jimmy", "Dalmatian",Color.BROWN,new String[] {"Âçÿòü","Êî ìíå"},shelter3);
        System.out.println(dog3.getInfo());
        dog3.makeVoice(2,"Ãàâ");



    }
}
