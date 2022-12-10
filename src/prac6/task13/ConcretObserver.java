package prac6.task13;

public class ConcretObserver implements Observer{
    @Override
    public void HadleEvent(MyStringBuilder stringBuilder) {
        System.out.println("Changes: " + stringBuilder.toString());
    }
}
