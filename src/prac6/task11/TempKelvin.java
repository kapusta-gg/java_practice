package prac6.task11;

public class TempKelvin implements Convertable{
    @Override
    public double convert(double temp) {
        return temp + 273;
    }
}
