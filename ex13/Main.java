package ex13;

public class Main {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1000);

        ContaCorrente contaCorrente = new ContaCorrente(contaBancaria.getSaldo());
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal(0);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

    }
}
