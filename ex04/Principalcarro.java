package ex04;

public class Principalcarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.modelo = "Civic";
        c1.cor = "Preto";
        c1.ano = 2015;

        c1.mostraFichaTecnica();
        System.out.println("A idade do carro é " + c1.pegaIdade() + " anos");
    }
}
