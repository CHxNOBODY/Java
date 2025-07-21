public class CarFactory {
    public static Car produceCar(String model, String color, String VIN) {
        return new Car(model, color, VIN);
    }
}