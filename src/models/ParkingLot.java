package models;

public class ParkingLot {
    private String name;
    private int totalFloors;

    public ParkingLot(String name, int totalFloors) {
        this.name = name;
        this.totalFloors = totalFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }
}
