package lesson05.lab.prob3;

public class App {

    public static void main(String args[]) {

        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.startEngine();

        Vehicle truck = VehicleFactory.getVehicleIns("truck");
        truck.startEngine();
    }
}
