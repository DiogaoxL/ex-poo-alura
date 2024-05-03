package ex08;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    public void aplicarDesconto (double porcentual){
        double desconto = precoProduto - ((precoProduto * porcentual)/100);
        System.out.println("O preço do produto é " + precoProduto + " com o desconto de " + porcentual + "% você pagara: R$" + desconto);
    }

}
