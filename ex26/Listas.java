package ex26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> conteudoArrayList = new ArrayList<>();
        conteudoArrayList.add( ("Top Gun"));
        conteudoArrayList.add("Avatar");
        conteudoArrayList.add( "Harry Potter");

        Collections.sort(conteudoArrayList);
        System.out.println("Usando ArrayList:");
        System.out.println(conteudoArrayList);

        List<String> conteudoLinkedList = new LinkedList<>();
        conteudoLinkedList.add( ("Top Gun"));
        conteudoLinkedList.add("Avatar");
        conteudoLinkedList.add( "Harry Potter");

        Collections.sort(conteudoLinkedList);
        System.out.println("Usando LinkedList:");
        System.out.println(conteudoLinkedList);



    }
}
