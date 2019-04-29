package progcom;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;
    public ListaDeCompras(){
        produtos = new ArrayList<Produto>();
    }

    public boolean adicionarproduto(Produto p){
        if(p == null) return false;

        produtos.add(p);
        return true;



     }



}

