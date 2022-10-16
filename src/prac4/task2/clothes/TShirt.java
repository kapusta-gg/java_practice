package prac4.task2.clothes;

import prac4.task2.MenClothing;
import prac4.task2.Sizes;
import prac4.task2.WomenClothing;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMen() {
        System.out.println("Надели футболку на мужчину");
    }

    @Override
    public void dressWomen(){
        System.out.println("Надели футболку на женщину");
    }

    public TShirt(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
