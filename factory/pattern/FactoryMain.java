package factory.pattern;

public class FactoryMain {
    public static void main(String[] args) {
        Vehicle newVehicle = VehicleFactory.getInstance("car", 4);
        System.out.println(newVehicle);
        newVehicle.msg();
//        Vehicle car1 =VehicleFactory.getInstance("car", 4);
//        System.out.println(car1);
        Vehicle vehicle1 = VehicleFactory.getInstance("bike",2);
        System.out.println(vehicle1);
        vehicle1.msg();

        Vehicle bus = VehicleFactory.getInstance("bus",6);
        System.out.println(bus);
        bus.msg();

    }
}
