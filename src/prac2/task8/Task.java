package prac2.task8;

public class Task {
    public static void main(String[] args) {
        String[] array = new String[] {"Winter", "Spring", "Summer", "Autumn", "a"};
        for(int i = 0; i < array.length / 2; i++){
            String buf = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = buf;
        }
        for (String str:
             array) {
            System.out.println(str);
        }
    }
}
