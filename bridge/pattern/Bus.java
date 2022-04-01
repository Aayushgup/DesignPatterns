package bridge.pattern;

public class Bus extends Vehicle{
    public Bus(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print("Bus is");
        workShop1.work();
        workShop2.work();
    }
}
