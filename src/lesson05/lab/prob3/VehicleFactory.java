package lesson05.lab.prob3;

public class VehicleFactory {

    private VehicleFactory() {

    }
    // getting object using Enum

    public static Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }

    // getting object using switch
    public static Vehicle getVehicleIns(String vehicleType) {
        String type = vehicleType.toUpperCase();
        switch (type) {
            case "CAR":
                return new Car();
            case "ELECTRICAR":
                return new ElectricCar();
            case "TRUCK":
                return new Truck();
        }
        return null;
    }
}
