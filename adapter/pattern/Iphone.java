package adapter.pattern;

public class Iphone {

    private IphoneCharger charger;
    public IphoneCharger getCharger() {
        return charger;
    }

    public void setCharger(IphoneCharger charger) {
        this.charger = charger;
    }


    public void charge(String str)
    {
        charger.charge(str);
    }

}
