package prac6.task10;

import java.util.ArrayList;

public class Shop implements ShopInterface{
    private ArrayList<Computer> shop = new ArrayList<>();

    @Override
    public void addComputer(Computer computer) {
        this.shop.add(computer);
        System.out.println("Компьютер добавлен");
    }

    @Override
    public void deleteComputer(Computer computer) {
        if(shop.contains(computer)){
            this.shop.remove(computer);
            System.out.println("Компьютер успешно удален");
        }
        else System.out.println("Компьютера нет в списке");
    }

    @Override
    public void seeCatalog() {
        for (Computer computer: this.shop) {
            System.out.println(computer);
        }
    }
}
