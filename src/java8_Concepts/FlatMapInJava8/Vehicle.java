package java8_Concepts.FlatMapInJava8;

import java.util.List;

public class Vehicle {
    private String brand;
    private String model;
    private String type;
    private double price;
    private String fuelType;
    private int year;
    private List<String> features; // ✅ New List field

    public Vehicle(String brand, String model, String type, double price, String fuelType, int year, List<String> features) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.fuelType = fuelType;
        this.year = year;
        this.features = features;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public String getFuelType() { return fuelType; }
    public int getYear() { return year; }
    public List<String> getFeatures() { return features; }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public void setYear(int year) { this.year = year; }
    public void setFeatures(List<String> features) { this.features = features; }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", type=" + type + ", price=" + price +
               ", fuelType=" + fuelType + ", year=" + year + ", features=" + features + "]";
    }
}
