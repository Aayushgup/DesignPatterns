package facade.pattern;

public class SoftwareCheck {
    OsCheck osCheckOnBoot;
    DriverCheck driverCheck;

    public SoftwareCheck() {
        this.osCheckOnBoot = new OsCheck();
        this.driverCheck = new DriverCheck();
    }

    boolean checkSoftwareOnBoot(){
        return osCheckOnBoot.checkOSOnBoot() && driverCheck.checkDriverOnBoot();
    }
}
