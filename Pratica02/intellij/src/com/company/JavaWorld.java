package com.company;

public class JavaWorld {

    String nome;
    double ki;
    boolean odio;
    int nivelDeSuper;

    public void  treinar(){


        if (odio)
            ki = ki * 1.2;

        else
            ki = ki * 1.1;
        System.out.println("Deois do treino o poer de luta é: " + ki);
    }

    public String pegarCorDoCabelo() {
        String resultado;
        if (nivelDeSuper == 0)
            resultado = "Preto";
        else if (nivelDeSuper > 0 && nivelDeSuper <= 3)
            resultado = "Amarelo";
        else
            resultado = "Azul";
        return resultado;
    }
}



