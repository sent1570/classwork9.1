package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Sonny", "��. ������������ 91");
        Dog dog = new Dog("Luna", "GG", Color.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice("���",4);
        System.out.println();

        Shelter shelter2 = new Shelter("Animals", "��. ��������");
        Dog dog2 = new Dog("Rex", "Bulldog", new String[] {"������","������"},Color.WHITE,shelter2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("���");
        System.out.println();

        Shelter shelter3 = new Shelter("Pets", "��. ���������");
        Dog dog3 = new Dog("Jimmy", "Dalmatian",Color.BROWN,new String[] {"�����","�� ���"},shelter3);
        System.out.println(dog3.getInfo());
        dog3.makeVoice(2,"���");



    }
}
