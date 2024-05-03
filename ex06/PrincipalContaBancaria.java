package ex06;

public class PrincipalContaBancaria {

    public static void main(String [] args){

        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular= "Diogo";
        conta1.setSaldo(2500);
        conta1.setNumeroConta(1212);

        conta1.dadosConta();

        conta1.setSaldo(3000);

        conta1.dadosConta();

    }
}
