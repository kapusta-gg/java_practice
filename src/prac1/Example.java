package prac1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // task 3
        for (String str: args) {
            System.out.println(str);
        }
        // task 4
        for(int i = 1; i <= 10; i++)
            System.out.print("1/" +  Integer.toString(i) + " + ");
        System.out.println("...");

        // task 5
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println(fact);
    }

    static void task1(){
        int[] arr = new int[10];
        int summary = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            summary += arr[i];
        }
        System.out.println("Sum: " + summary);
        System.out.println("Arithmetic mean: " + summary / 10);}


    static void task2(){
        int[] arr = new int[10];
        int i = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int summary = 0;
        while(i < 10){
            arr[i] = sc.nextInt();
            summary += arr[i];
            if (arr[i] < minimum){
                minimum = arr[i];
            }

            if (arr[i] > maximum){
                maximum = arr[i];
            }

            i += 1;
        }
        System.out.println("Min: " + minimum);
        System.out.println("Max: " + maximum);
        System.out.println("Sum: " + summary);
    }
}
