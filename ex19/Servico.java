package ex19;

public class Servico implements Vendavel{
    private double precoHora;
    private int horas;
    @Override
    public double precoTotal(int horas){
        this.horas = horas;
        return horas * precoHora;
    }

    @Override
    public double aplicarDesconto(double porcentagem){
       return precoHora -= precoHora * (porcentagem / 100.0);
    }
}
