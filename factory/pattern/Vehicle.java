package factory.pattern;

abstract class Vehicle {
    public abstract int getWheel();
    public abstract void msg();
    public String toString() {
        return "Wheel: " + this.getWheel();
    }

}
