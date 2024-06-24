package ex21;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(new Produto("Trakinas" , 2.80 , 3));
        listaDeProdutos.add(new Produto("puma" , 5 , 5));
        listaDeProdutos.add(new Produto("Manteiga" , 4.5 , 10));


        System.out.println("Temos " + listaDeProdutos.size() + " produtos em nossa lista");
        System.out.println("O primeiro produto cadastrado foi: " + listaDeProdutos.get(0).toString());

        listaDeProdutos.add(new ProdutoPerecivel("carne" , 45 , 3 , "25/05/2024") );

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }
}
