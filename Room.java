public class Room {
    private double area;
    private int windows;
    private boolean lights;

    public Room(double area, int windows, boolean lights) {
        this.area = area;
        this.windows = windows;
        this.lights = lights;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }
    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        if (windows >= 0) {
            this.windows = windows;
        }
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public void turnLigthsOn() {
        if (this.lights) {
            System.out.println("Lights are already on!");
        } else {
            this.lights = true;
            System.out.println("Lights are turned on!");
        }
    }

    public void turnLigthsOff() {
        if (this.lights) {
            this.lights = false;
            System.out.println("Lights are turned off!");
        } else {
            System.out.println("Lights are already off!");
        }
    }

    public void roomVolume() {
        double volume = this.area * 3.0;
        System.out.printf("Room volume is %.2f m^3\n", volume);
    }
}
