package factory.pattern;


class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }

    @Override
    public void msg() {
        System.out.println("Bike is Created !");
    }
}
