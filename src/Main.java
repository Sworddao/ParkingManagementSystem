import models.Ticket;
import models.ParkingLot;
import models.ParkingFloor;
import models.ParkingSpot;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("ABC123", "BMW", "X5");
        ParkingLot pl1 = new ParkingLot("Falano Parking Lot", 4);
        ParkingFloor pf1 = new ParkingFloor("Falano Parking Lot", 4, "Ground Floor", 50);
        ParkingSpot ps1 = new ParkingSpot("Falano Parking Lot", 4, "Ground Floor", 50, 12, "Compact", true);
        Ticket t1 = new Ticket(1200, v1.getBrand(), ps1.getSpotNumber());

        ps1.checkAvailability();
        t1.printTicketDetails();
        v1.printVehicleDetails();
    }
}
