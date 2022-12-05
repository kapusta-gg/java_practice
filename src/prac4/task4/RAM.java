package prac4.task4;

public class RAM {
    private  MemoryType memoryType;
    private  byte memoryCapacity;

    public RAM(MemoryType memoryType, byte memoryCapacity){
        this.memoryType = memoryType;
        this.memoryCapacity = memoryCapacity;
    }

    public byte getMemoryCapacity() {
        return memoryCapacity;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }
}
