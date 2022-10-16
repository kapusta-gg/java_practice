package prac4.task2.clothes;
import prac4.task2.Sizes;
import prac4.task2.WomenClothing;

public class Skirt extends Clothes implements WomenClothing {
    @Override
    public void dressWomen(){
        System.out.println("Надели ... на женщину");
    }

    public Skirt(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}