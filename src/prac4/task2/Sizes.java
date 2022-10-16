package prac4.task2;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    private Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if(this.equals(Sizes.XXS)) return "Детский размер";
        else return "Взрослый размер";
    }
}
