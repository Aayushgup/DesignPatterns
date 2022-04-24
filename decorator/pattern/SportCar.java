package decorator.pattern;

public class SportCar extends DecoratorCar{
    public SportCar(Car car) {
        super(car);
    }
    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Adding Sports Features to Car");
    }
}
