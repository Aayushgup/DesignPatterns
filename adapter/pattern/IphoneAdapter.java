package adapter.pattern;

public class IphoneAdapter implements IphoneCharger {

   AndroidCharger newCharger=new AndroidCharger() ;

    @Override
    public void charge(String str) {

       newCharger.charge(str);
    }
}
