public class ComputerClass extends Classroom {
    private int pcCount;
    private int internetSpeed;
    private String operatingSystem;

    public ComputerClass(double area, int windows, boolean lights,
                         int desks, boolean hasProjector, String boardType,
                         int pcCount, int internetSpeed, String operatingSystem) {
        super(area, windows, lights, desks, hasProjector, boardType);
        this.pcCount = pcCount;
        this.internetSpeed = internetSpeed;
        this.operatingSystem = operatingSystem;
    }

    public int getPcCount() {
        return pcCount;
    }

    public void setPcCount(int pcCount) {
        if (pcCount >= 0) {
            this.pcCount = pcCount;
        }
    }

    public int getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        if (internetSpeed >= 0) {
            this.internetSpeed = internetSpeed;
        }
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void turnOnAllPCs() {
        System.out.println("All PCs turned on!");
    }

    public void rebootNetwork() {
        System.out.println("Rebooting Network...");
    }

    public void checkOperatingSystem() {
        System.out.printf("All PCs in this classroom have %s operating system.", this.operatingSystem);
    }
}