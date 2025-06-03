package ConceptsCode.Inheritance;

public class mainMethod {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.drive();
        twoWheeler.commute();

        Bike bike = new Bike();
        bike.drive();
        bike.commute();
        bike.BikeRide();
    }
}
