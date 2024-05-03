package ex17;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32 ) / 1.8;
    }
}
