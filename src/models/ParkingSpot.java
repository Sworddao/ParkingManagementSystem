package models;

public class ParkingSpot extends ParkingFloor {
    private int spotNumber;
    private String type;
    private boolean isAvailable;

    public ParkingSpot(String name, int totalFloors, String floorName, int totalSpots, int spotNumber, String type, boolean isAvailable) {
        super(name, totalFloors, floorName, totalSpots);
        this.spotNumber = spotNumber;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkAvailability() {
        System.out.println("Spot Number: " + spotNumber);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
