package prac4.task1;

import java.lang.reflect.Type;

public class Main {
    public enum Seasons{
        AUTUMN(10),
        WINTER (-10),
        SPRING (14),
        SUMMER (20);

        private final int temp;
        private Seasons(int temp) {
            this.temp = temp;
        }

        public String getDescription(){
            if(this.equals(Seasons.SUMMER)) return "Тёплое время года";
            else return "Холодное время года";
        }

        //не работает
//        public static void valueOf(Seasons season){
//            System.out.println(season.toString() + " " + season.temp + " " + season.getDescription());
//        }

        @Override
        public String toString() {
            return this.name() + " " +  this.temp + " " + this.getDescription();
        }
    }

    public static void likeMethod(Seasons season){
        switch (season){
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
        }
    }

    public static void main(String[] args) {
        Seasons winter = Seasons.WINTER;
        System.out.println("Зимой очень холодно");
        likeMethod(Seasons.AUTUMN);
        for (Seasons season: Seasons.values()){
            System.out.println(season);
        }
    }

}

