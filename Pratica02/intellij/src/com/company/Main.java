package com.company;

public class Main {

    public static void main(String[] args) {
        JavaWorld s1;
        s1 = new JavaWorld();
        s1.nome = "Vegeta";
        JavaWorld s2 = new JavaWorld();
        s2.nome = "Brolly";
        s1.ki = 1000.0;
        s2.ki = 1000000.0;
        s1.odio = true;
        System.out.println(s1.nome);
        s1.treinar();
        s2.treinar();

    }
}
