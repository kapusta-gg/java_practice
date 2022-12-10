package prac6.task10;

public class Processor {
    private byte processorCores;
    private int clockFrequency;
    private int internalMemorySize;

    public Processor(byte processorCores, int clockFrequency, int internalMemorySize){
        this.processorCores = processorCores;
        this.clockFrequency = clockFrequency;
        this.internalMemorySize = internalMemorySize;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processorCores=" + processorCores +
                ", clockFrequency=" + clockFrequency +
                ", internalMemorySize=" + internalMemorySize +
                '}';
    }
}
