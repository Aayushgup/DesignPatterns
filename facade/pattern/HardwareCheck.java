package facade.pattern;

public class HardwareCheck {
    MotherBoard motherBoard;
    Ram ram;

    public HardwareCheck() {
        this.motherBoard = new MotherBoard();
        this.ram = new Ram();
    }

    boolean checkAllHardware(){

        return motherBoard.checkMotherBoardOnBoot() && ram.checkRAMOnBoot();
    }
}
