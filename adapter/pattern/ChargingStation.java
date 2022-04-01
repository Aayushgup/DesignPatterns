package adapter.pattern;

public class ChargingStation {

    public static void main(String[] args) {


        AndroidCharger typeC = new AndroidCharger(); // new Android charger

        Iphone iphone12=new Iphone();

        //iphone12.setCharger(typeC);

        IphoneCharger i=new IphoneAdapter();   // now making new charger using Adapter
        iphone12.setCharger(i);
        iphone12.charge("Yayy!! charging started");


    }
}
