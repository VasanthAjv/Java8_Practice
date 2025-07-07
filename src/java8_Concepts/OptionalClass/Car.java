package java8_Concepts.OptionalClass;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String fuelType;
    private double price;
    private String color;
    private boolean isAutomatic;

    // Constructor
    public Car(String brand, String model, int year, String fuelType, double price, String color, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.price = price;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }
   public Car(){
	   
   }

    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isAutomatic() { return isAutomatic; }
    public void setAutomatic(boolean isAutomatic) { this.isAutomatic = isAutomatic; }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year +
               ", fuelType=" + fuelType + ", price=" + price + ", color=" + color +
               ", isAutomatic=" + isAutomatic + "]";
    }
}

