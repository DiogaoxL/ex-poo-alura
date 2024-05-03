package ex18;

public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double prod1 , double prod2){
        return prod1 + prod2;
    }
}
