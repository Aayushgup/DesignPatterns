package decorator.pattern;

public class BasicCar implements Car{
    @Override
    public void assembleCar() {
        System.out.println("Assembled Base Version --");
    }
}
