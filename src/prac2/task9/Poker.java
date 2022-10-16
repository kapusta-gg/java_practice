package prac2.task9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] suit = new String[] {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] dignity = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> cards = new ArrayList<>();

        Random generator = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во игроков(не больше 10)");
        int num_of_players;
        while (true){
            num_of_players = sc.nextInt();
            if (num_of_players <= 10 && num_of_players > 0) break;
            else System.out.println("Неверные данные");
        }
        while (cards.size() < num_of_players * 5){
            String card = suit[generator.nextInt(suit.length)] + dignity[generator.nextInt(dignity.length)];
            if(!cards.contains(card)) cards.add(card);
        }
        for (int i = 0; i < num_of_players; i++){
            System.out.println("Игрок " + (i + 1));
            String temp = "";
            for (int j = 0; j < 5; j++) temp += cards.get(5 * i + j) + " ";
            System.out.println(temp);
        }
    }
}
