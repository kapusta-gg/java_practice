package prac4.task2.clothes;

import prac4.task2.MenClothing;
import prac4.task2.Sizes;
import prac4.task2.WomenClothing;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMen() {
        System.out.println("Надели штаны на мужчину");
    }

    @Override
    public void dressWomen(){
        System.out.println("Надели штаны на жещину");
    }

    public Pants(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
