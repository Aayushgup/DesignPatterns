package decorator.pattern;

public class LuxuryCar extends DecoratorCar {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Adding Luxury Features to Car");
    }
}
