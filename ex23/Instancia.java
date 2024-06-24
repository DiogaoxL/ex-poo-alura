package ex23;

import java.util.ArrayList;

public class Instancia {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                animal.emitirSom();
            }

        }
    }
}
