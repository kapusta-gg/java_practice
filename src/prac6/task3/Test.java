package prac6.task3;

public class Test implements Nameable{
    private String string = "test";
    @Override
    public String getName() {
        return string;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getName());
        Human human = new Human("Anton");
        System.out.println(human.getName());
    }
}
