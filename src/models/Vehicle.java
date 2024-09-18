package models;

public class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;

    public Vehicle(String licensePlate, String brand, String model) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printVehicleDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
