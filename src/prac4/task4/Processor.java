package prac4.task4;

public class Processor {
    private byte processorCores;
    private int clockFrequency;
    private int internalMemorySize;

    public Processor(byte processorCores, int clockFrequency, int internalMemorySize){
        this.processorCores = processorCores;
        this.clockFrequency = clockFrequency;
        this.internalMemorySize = internalMemorySize;
    }

    public byte getProcessorCores() {
        return processorCores;
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public int getInternalMemorySize() {
        return internalMemorySize;
    }
}
