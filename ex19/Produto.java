package ex19;

public class Produto implements Vendavel{
    private String nome;
    private double valorUnitario;

    public Produto(String nome , int valorUnitario){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }
    @Override
    public double precoTotal(int quantidade){
        return valorUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double porcentagem){
        valorUnitario -= valorUnitario * (porcentagem / 100);
        return  valorUnitario;
    }
}
