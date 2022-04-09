package facade.pattern;

public class LaptopOnSwitch {
    SoftwareCheck softwareCheck;
    HardwareCheck hardwareChecks;

    public LaptopOnSwitch() {
        this.softwareCheck = new SoftwareCheck();
        this.hardwareChecks = new HardwareCheck();
    }

    void turnOn(){
        if(hardwareChecks.checkAllHardware() && softwareCheck.checkSoftwareOnBoot()){
            System.out.println("Switching on laptop");
        }
    }
}
