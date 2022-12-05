package prac4.task4;

public class Computer {
    private RAM ram;
    private PowerSupply powerSupply;
    private Processor processor;
    private ComputerBrands computerBrand;

    public Computer(RAM ram, PowerSupply powerSupply, Processor processor, ComputerBrands computerBrand){
        this.ram = ram;
        this.powerSupply = powerSupply;
        this.processor = processor;
        this.computerBrand = computerBrand;
    }
}
