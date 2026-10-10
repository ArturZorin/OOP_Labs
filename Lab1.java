public class Lab1 {
    public static void main() {
        ComputerClass first_audience = new ComputerClass(100.0, 4, false,
                                                         15, true, "marker",
                                                         30, 500, "Linux");

        first_audience.turnLigthsOn();
        first_audience.roomVolume();
        first_audience.turnLigthsOff();

        first_audience.studentsCapacity();
        first_audience.startPresentation();
        first_audience.clearBoard();

        first_audience.turnOnAllPCs();
        first_audience.rebootNetwork();
        first_audience.checkOperatingSystem();
    }
}