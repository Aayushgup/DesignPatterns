package builder.pattern;

public class Driver {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        Vehicle truck= new Vehicle.VehicleBuilder("5660cc",8).build();

        System.out.println(car);
        System.out.println("Engine is "+ car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());
        System.out.println(car.getColor());

        System.out.println("--------------------------");

        System.out.println("Engine is "+ truck.getEngine());
        System.out.println(truck.getWheel());
        System.out.println(truck.getAirbags());
        System.out.println(truck.isAc());
    }
}
