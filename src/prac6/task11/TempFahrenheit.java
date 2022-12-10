package prac6.task11;

public class TempFahrenheit implements Convertable{
    @Override
    public double convert(double temp) {
        return (temp + 459) / 1.8;
    }
}
