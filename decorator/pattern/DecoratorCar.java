package decorator.pattern;

public class DecoratorCar implements Car{
    private Car car;
    public DecoratorCar(Car car)
    {
       // super();
        this.car=car;
    }
    @Override
    public void assembleCar() {
       car.assembleCar();
    }
}
