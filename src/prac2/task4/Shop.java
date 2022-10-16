package prac2.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<String> list_of_computers = new ArrayList<>();

    public Shop(){};

    private void addComputer(String computer){
        list_of_computers.add(computer);
    }

    private void deleteComputer(String computer){
        list_of_computers.remove(computer);
    }

    private void findComputer(String computer){
        if (list_of_computers.contains(computer)){System.out.println("\t\t\tТакой компьютер есть в наличии");}
        else {System.out.println("\t\t\tТакого компьютера нет в наличии");}
    }

    public void startWork(){
        Scanner sc = new Scanner(System.in);
        String access_level = "";
        System.out.println("Введите уровень доступа: (user or admin)");
        while (true){
            access_level = sc.nextLine();
            if (access_level.equals("user") || access_level.equals("admin")){break;}
            else{System.out.println("Введите правильный уровень доступа");}
        }
        System.out.println("Введите 0 для выхода");
        System.out.println("Введите 1 для поиска компьютера");
        if (access_level.equals("admin")){
            System.out.println("Введите 2 для удаления компьютера из списка");
            System.out.println("Введите 3 для добавления компьютера в список");
        }
        while (true){
            System.out.println("Введите число: ");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 0){break;}
            else
                System.out.println("\t\tВведите название компьютера");
            String computer = sc.nextLine();
            if (num == 1){this.findComputer(computer);}
            else if (num == 2 && access_level.equals("admin")){this.deleteComputer(computer);}
            else if (num == 3 && access_level.equals("admin")){this.addComputer(computer);}
            else {System.out.println("Не верное число");}
        }
    }

    @Override
    public String toString() {
        String str = "Shop:\n";
        for (String computer:
             list_of_computers) {
            str += computer + "\n";
        }
        return str;
    }
}
