package org.example;

public class Main {
    public static void main(String[] args) {
        Boxer gentlemanJim = new Boxer();
        gentlemanJim.nickname = "Bob";
        gentlemanJim.age = 30;
        gentlemanJim.weight = 92;
        System.out.println(gentlemanJim);
        gentlemanJim.toPunch();
    }
}