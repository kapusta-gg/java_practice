package prac6.task12;

import java.util.Stack;

public class MyStringBuilder{
    private StringBuilder stringBuilder;
    private Stack<Action> actions = new Stack<>();

    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    public MyStringBuilder reverse() {
        stringBuilder.reverse();
        Action action = () -> stringBuilder.reverse();
        actions.add(action);
        return this;
    }


    public MyStringBuilder append(String str) {
        stringBuilder.append(str);
        Action action = () -> stringBuilder.delete(
                stringBuilder.length() - str.length() -1,
                stringBuilder.length());
        actions.add(action);
        return this;
    }
}
