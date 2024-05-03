package ex06;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void dadosConta(){
        System.out.println("Nome: " + titular);
        System.out.println("N° da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

}
