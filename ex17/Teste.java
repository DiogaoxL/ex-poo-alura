package ex17;

public class Teste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        System.out.println(temperatura.celsiusParaFahrenheit(25));
        System.out.println(temperatura.fahrenheitParaCelsius(77));

    }
}

