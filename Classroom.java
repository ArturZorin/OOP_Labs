public class Classroom extends Room {
    private int desks;
    private boolean hasProjector;
    private String boardType;

    public Classroom(double area, int windows, boolean lights, 
                     int desks, boolean hasProjector, String boardType) {
        super(area, windows, lights);
        this.desks = desks;
        this.hasProjector = hasProjector;
        this.boardType = boardType;
    }

    public int getDesks() {
        return desks;
    }

    public void setDesks(int desks) {
        if (desks >= 0) {
            this.desks = desks;
        }
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public void studentsCapacity() {
        int capacity = this.desks * 2;
        System.out.printf("Capacity of this classroom: %d\n", capacity);
    }

    public void clearBoard() {
        System.out.println("Board cleaned!");
    }
    
    public void startPresentation() {
        if (this.hasProjector) {
            System.out.println("Okay, this classroom has projector! Starting presentation...");
        } else {
            System.out.println("Oh, this classroom has NOT projector!");
        }
    }
}