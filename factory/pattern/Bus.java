package factory.pattern;

public class Bus extends Vehicle {
   int wheel;

    public Bus(int wheel) {
        this.wheel=wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public void msg() {
       System.out.println("Bus is Created !");
    }
}
