package ex18;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double prod1 , double prod2){
        return prod2 + prod1;
    }
}
