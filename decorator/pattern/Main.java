package decorator.pattern;

public class Main {
    public static void main(String[] args) {
//       Car c1=new BasicCar();
//       c1.assembleCar();
//
//       Car c2=new LuxuryCar(new BasicCar());
//       c2.assembleCar();

       Car c3=new SportCar(new LuxuryCar(new BasicCar()));
       c3.assembleCar();
    }
}
