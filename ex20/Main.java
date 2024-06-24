package ex20;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Diogo");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Marcos");
        pessoa2.setIdade(21);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

       for(Pessoa p : pessoas){
           System.out.println(p);
       }

        System.out.println("Temos " + pessoas.size() + " pessoa(s) na lista");

    }
}
