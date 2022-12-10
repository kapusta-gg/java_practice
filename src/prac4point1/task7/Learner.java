package prac4point1.task7;

import java.util.ArrayList;

public class Learner {
    static ArrayList<Learner> learners = new ArrayList<>();

    public static void main(String[] args) {
        learners.add(new Pupil("Anton"));
        learners.add(new Student("Bogdan"));
        learners.add(new Pupil("Vera"));
        learners.add(new Student("Volodimir"));
        learners.add(new Student("Alexey"));
        learners.add(new Pupil("Elizaveta"));
        learners.add(new Pupil("Polina"));

        System.out.println("Students:");
        for (Learner learner: learners) {
            if(learner instanceof Student){
                System.out.println(((Student) learner).getName());
            }
        }
        System.out.println();
        System.out.println("Pupils:");
        for (Learner learner: learners) {
            if(learner instanceof Pupil){
                System.out.println(((Pupil) learner).getName());
            }
        }
    }
}
