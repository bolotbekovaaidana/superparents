package main;

import person.Dancer;
import person.Person;
import person.Programmer;
import person.Singer;

public class Main {
    public static void main(String[] args) {
        Singer singer=new Singer();
        singer.setName("Aidana");
        singer.setAge(15);
        singer.setLastname("Bolotbekova");
        singer.setJob("singer");
        singer.sing();
        System.out.println(singer);
        Dancer dancer=new Dancer();
        dancer.setName("Medina");
        dancer.setAge(15);
        dancer.setLastname("Mamatova");
        dancer.setDance("she loves to dance");
        dancer.dance1();
        System.out.println(dancer);
        Programmer programmer=new Programmer();
        programmer.setName("Sezima");
        programmer.setAge(15);
        programmer.setLastname("Tashbolotova");
        programmer.setSit("she sits and works all day");
        programmer.wage();
        System.out.println(programmer);
    }
}