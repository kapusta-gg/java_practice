package prac6.task4;

public class Computer implements Priceable{
    private double price;

    public Computer(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Computer comp = new Computer(214124.21);
        System.out.println(comp.getPrice());
    }
}
