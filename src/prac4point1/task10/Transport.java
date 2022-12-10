package prac4point1.task10;

public abstract class Transport {
    protected double costPerHours;
    protected double costPerKg; // плата за 1 кг груза

    protected Transport(int costPerHours, int costPerKg){this.costPerHours = costPerHours; this.costPerKg = costPerKg;}

    public double allSum(double baggageWeight, double travelTimeInHours){
        return baggageSum(baggageWeight) + travelTimeSum(travelTimeInHours);
    }

    public double baggageSum(double baggageWeight){return baggageWeight * this.costPerKg;}
    public double travelTimeSum(double travelTimeInHours){return travelTimeInHours * this.costPerHours;}

    public static void main(String[] args) {
        System.out.println("Цена за 2 часа полета и багажом весом в 3 кг");
        double hours = 2;
        double baggageWeight = 3;
        Plain plain = new Plain();
        Train train = new Train();
        System.out.println("При использовании самолета");
        System.out.println(plain.allSum(3,2));
        System.out.println("При использовании поезда");
        System.out.println(train.allSum(3,2));
    }
}
