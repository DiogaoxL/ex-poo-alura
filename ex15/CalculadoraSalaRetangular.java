package ex15;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(int base , int altura){
        int area = base * altura;
        System.out.println("A area da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(int base , int altura){
        int perimetro = 2 * (base + altura);
        System.out.println("O perimetro da sala retangular é: " + perimetro);
    }
}
