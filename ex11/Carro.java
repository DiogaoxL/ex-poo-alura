package ex11;

public class Carro {
    private String nomeCarro;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;


    public void definirValores(String nomeCarro , double valorAno1, double valorAno2 , double valorAno3){
        this.nomeCarro = nomeCarro;
        this.valorAno1 = valorAno1;
        this.valorAno2 = valorAno2;
        this.valorAno3 = valorAno3;
    }

    public void exibir(){
        System.out.println("Nome: " + nomeCarro);
        System.out.println("Valor ano 1: " + valorAno1);
        System.out.println("Valor ano 2: " + valorAno2);
        System.out.println("Valor ano 3: " + valorAno3);

        System.out.println("O menor preço: " + calcularMenorPreco());
        System.out.println("O maior preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco(){
        double menorPreco = valorAno1;

        if (valorAno2 < menorPreco){
            menorPreco = valorAno2;
        }

        if (valorAno3 < menorPreco){
            menorPreco = valorAno3;
        }

        return menorPreco;

    }

    public double calcularMaiorPreco(){
        double maiorPreco = valorAno1;

        if (valorAno2 > maiorPreco ) {
            maiorPreco = valorAno2;
        }

        if (valorAno3 > maiorPreco){
            maiorPreco = valorAno3;
        }

        return maiorPreco;
    }







}
