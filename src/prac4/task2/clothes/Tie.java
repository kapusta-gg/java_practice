package prac4.task2.clothes;

import prac4.task2.MenClothing;
import prac4.task2.Sizes;

public class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMen(){
        System.out.println("Надели галстук на мужчину");
    }

    public Tie(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}