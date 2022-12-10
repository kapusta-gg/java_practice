package prac6.task10;

import prac4.task4.ComputerBrands;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Processor proccesor = new Processor((byte)4,32,64);
        Monitor monitor = new Monitor(32);
        Computer computer = new Computer(proccesor, monitor, ComputerBrands.Aser);
        shop.addComputer(computer);
        shop.seeCatalog();
        shop.deleteComputer(computer);
        shop.deleteComputer(computer);
        shop.seeCatalog();
    }
}
