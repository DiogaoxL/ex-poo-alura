package ex13;

public class ContaBancaria {
    protected double saldo;

    public  ContaBancaria() {
        this.saldo = 0;  // Saldo inicial padrão
    }

    // Adicionando um novo construtor que aceita um saldo inicial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial; // Inicializa o saldo com o valor fornecido
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double deposito){
        this.saldo += deposito;

        System.out.println("O valor do depósito é " + deposito);
        System.out.println("Seu saldo atual: " + saldo);
    }

    public void sacar(double saque){

        if (saldo > saque){
        saldo -= saque;
            System.out.println("Saque de " + saque + " realizado. Saldo atual: " + saldo);
        }else{
            System.out.println("Saldo insufiente para realizar o saque");
        }

    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual: " + saldo);
    }


}
