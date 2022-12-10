package prac6.task10;

//Марки компьютера использованы из 4 пракики 4 задание
import prac4.task4.ComputerBrands;

public class Computer {
    private Processor proccesor;
    private Monitor monitor;
    private ComputerBrands computerBrand;

    public Computer(Processor proccesor, Monitor monitor, ComputerBrands computerBrand) {
        this.proccesor = proccesor;
        this.monitor = monitor;
        this.computerBrand = computerBrand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "proccesor=" + proccesor +
                ", monitor=" + monitor +
                ", computerBrand=" + computerBrand +
                '}';
    }
}
