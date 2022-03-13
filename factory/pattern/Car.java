package factory.pattern;

class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }

    @Override
    public void msg() {
        System.out.println("Car is Created !");
    }
}
