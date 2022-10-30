package prac4.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private boolean isLogged;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> basket = new ArrayList();

    public void login(){
        System.out.println("Введите логин и пароль");
        String login = sc.nextLine();
        String password = sc.nextLine();
        if(!login.isEmpty() && !password.isEmpty()){
            this.isLogged = true;
        }
    }

    public void watchCatalog(){
        if(this.isLogged){
            for (Catalog catalog: Catalog.values()){
                System.out.println(catalog);
            }
        }
    }

    public void watchItems(){
        if (this.isLogged){
            System.out.println("Введите название каталога который хотетие посмотерть");
            Catalog items = Catalog.valueOf(sc.nextLine());
            switch (items) {
                case Phones -> {
                    for (Phones phone : Phones.values()) {
                        System.out.println(phone);
                    }
                }
                case Watches -> {
                    for (Watches watch : Watches.values()) {
                        System.out.println(watch);
                    }
                }
            }
        }
    }

    public void addToBasket(){
        if (this.isLogged){
            System.out.println("Введите название типа товара и название товара чтобы добавить его в корзину");
            Catalog catalog = Catalog.valueOf(sc.nextLine());
            String product = sc.nextLine();
            switch (catalog){
                case Phones:{
                    try {
                        Phones.valueOf(product);
                        this.basket.add(product);
                    } catch (Exception e) {
                        System.out.println("Неверное название товара");
                    }
                }
                case Watches:{
                    try {
                        Watches.valueOf(product);
                        this.basket.add(product);
                    } catch (Exception e) {
                        System.out.println("Неверное название товара");
                    }
                }
            }
        }
    }

    public void buyProducts(){
        System.out.println("Товары куплены!");
        basket.clear();
    }
}
