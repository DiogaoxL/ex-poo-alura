package ex22;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Nome> nomes = new ArrayList<>();

        nomes.add(new Nome("diogo"));
        nomes.add(new Nome("vini"));
        nomes.add(new Nome("math"));

        for(Nome lista : nomes){
            System.out.println(lista);
        }

    }

}
