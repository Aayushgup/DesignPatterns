package bridge.pattern;

public class Car extends Vehicle{
    public Car(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print("car is");
        workShop1.work();
        workShop2.work();
    }
}
