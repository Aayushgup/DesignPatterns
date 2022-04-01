package prototype.pattern;

import java.util.List;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.LoadData();

        Vehicle b =  (Vehicle) a.clone();
       // List<String> list = b.getVehicleList();
        b.getVehicleList().add("Honda Amaze");

        System.out.println(a.getVehicleList());
        System.out.println(b.getVehicleList());

        b.getVehicleList().remove("Xuv 700");  //removing data from vehicle b
        System.out.println(a.getVehicleList());  ///for vehicle a
        System.out.println(b.getVehicleList()); // for vehicle b
    }
}
