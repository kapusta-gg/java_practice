package prac4.task2;

import prac4.task2.clothes.Clothes;

import java.util.ArrayList;

public class Atelier {
    public void dressMen(ArrayList<MenClothing> clothes) {
        for(MenClothing clothe: clothes) clothe.dressMen();
    }

    public void dressWomen(ArrayList<WomenClothing> clothes){
        for(WomenClothing clothe: clothes) clothe.dressWomen();
    }

}
