package ex25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalEx25 {
    public static void main(String[] args) {
       List<TituloEx25> conteudo = new LinkedList<>();
        conteudo.add(new TituloEx25("Top Gun"));
        conteudo.add(new TituloEx25("Avatar"));
        conteudo.add(new TituloEx25("Harry Potter"));

        Collections.sort(conteudo);

        System.out.println(conteudo);
    }
}
