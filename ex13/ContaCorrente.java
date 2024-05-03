package ex13;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }


    public void cobrarTarifaMensal(double tarifa){
        saldo -= tarifa;
        System.out.println("Tarifa mensal de " + tarifa + " cobrada. Seu saldo atual: " + saldo);
    }

}
