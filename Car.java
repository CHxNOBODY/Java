public class Car {
    private String model;
    private String color;
    private final String VIN;
    public static int totalCarsProduced = 0;

    public Car(String model, String color, String VIN) {
        this.model = model;
        this.color = color;
        this.VIN = VIN;
        totalCarsProduced++;
    }

    public String getVIN() {
        return VIN;
    }
}
