package prac4.task4;

public class PowerSupply {
    private int power;
    private ConnectorsType connectorType;

    public PowerSupply(int power, ConnectorsType connectorType){
        this.power = power;
        this.connectorType = connectorType;
    }

    public int getPower() {
        return power;
    }

    public ConnectorsType getConnectorType() {
        return connectorType;
    }
}
