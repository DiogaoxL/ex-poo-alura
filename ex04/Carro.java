package ex04;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void mostraFichaTecnica(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);

    }

    int pegaIdade(){
        return 2024 - ano;
    }

}
