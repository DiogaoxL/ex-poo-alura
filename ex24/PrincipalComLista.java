package ex24;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(9);
        numeros.add(3);
        numeros.add(5);

        Collections.sort(numeros);

        System.out.println(numeros);

    }
}
