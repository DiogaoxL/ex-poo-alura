package ex14;

public class ConversorDeMoedas implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double conversao = valorDolar * 5.18;
        System.out.println("O valor em reais é: R$" + conversao);
    }
}
