package models;

public class ParkingFloor extends ParkingLot {
    private String floorName;
    private int totalSpots;

    public ParkingFloor(String name, int totalFloors, String floorName, int totalSpots) {
        super(name, totalFloors);
        this.floorName = floorName;
        this.totalSpots = totalSpots;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots(int totalSpots) {
        this.totalSpots = totalSpots;
    }
}
