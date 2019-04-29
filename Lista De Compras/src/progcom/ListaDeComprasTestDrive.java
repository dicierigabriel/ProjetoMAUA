package progcom;

import java.util.Scanner;

public class ListaDeComprasTestDrive {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            String nome = scanner.next();
            if(listaDeCompras.adicionarproduto(
                    new Produto(nome)
            )) {
                System.out.println("Produto Adicionado");
            } else {
                System.out.println("Erro");
            }
        }
    }
}