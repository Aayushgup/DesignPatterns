package bridge.pattern;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bus(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
