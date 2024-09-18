package models;

public class Ticket {
    private double parkingFee;
    private String vehicleBrand;
    private int spotNumber;

    public Ticket(double parkingFee, String vehicleBrand, int spotNumber) {
        this.parkingFee = parkingFee;
        this.vehicleBrand = vehicleBrand;
        this.spotNumber = spotNumber;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void printTicketDetails() {
        System.out.println("Ticket Details:");
        System.out.println("Vehicle Brand: " + vehicleBrand);
        System.out.println("Spot Number: " + spotNumber);
        System.out.println("Parking Fee: $" + parkingFee);
    }
}
