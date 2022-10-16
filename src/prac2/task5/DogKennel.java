package prac2.task5;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public void allDogs(){
        for (Dog dog:
             dogs) {
            System.out.println(dog);
        }
    }
}
