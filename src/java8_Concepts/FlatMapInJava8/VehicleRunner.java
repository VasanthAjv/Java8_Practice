package java8_Concepts.FlatMapInJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleRunner {
	public static List<Vehicle> vehicles = new ArrayList<>();
	public static void useFlatMap() {
	
		List<String>str=vehicles.stream()
				.map(Vehicle::getFeatures)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		str.forEach(System.out::println);
	}
	public static void mapFunction() {
		List<List<String>>ex=vehicles.stream()
				.map(Vehicle::getFeatures)
				.collect(Collectors.toList());
		System.out.println(ex);
	}
    public static void main(String[] args) {

        

        vehicles.add(new Vehicle("Honda", "City", "Sedan", 1200000.0, "Petrol", 2020,
                Arrays.asList("ABS", "Airbags", "Sunroof")));

        vehicles.add(new Vehicle("Hyundai", "Creta", "SUV", 1500000.0, "Diesel", 2022,
                Arrays.asList("Cruise Control", "Touchscreen", "Rear Camera")));

        vehicles.add(new Vehicle("Tata", "Nexon", "SUV", 1300000.0, "Electric", 2023,
                Arrays.asList("ABS", "Reverse Camera", "Hill Assist")));

        vehicles.add(new Vehicle("Maruti", "Swift", "Hatchback", 700000.0, "Petrol", 2021,
                Arrays.asList("Power Windows", "Bluetooth", "ABS")));

        vehicles.add(new Vehicle("Kia", "Seltos", "SUV", 1600000.0, "Petrol", 2023,
                Arrays.asList("Sunroof", "Airbags", "Voice Assist")));

        vehicles.add(new Vehicle("Toyota", "Innova", "MPV", 2000000.0, "Diesel", 2020,
                Arrays.asList("Captain Seats", "Rear AC", "ABS")));

        vehicles.add(new Vehicle("Renault", "Kwid", "Hatchback", 500000.0, "Petrol", 2021,
                Arrays.asList("Touchscreen", "Rear Parking Sensor")));

        vehicles.add(new Vehicle("Skoda", "Slavia", "Sedan", 1400000.0, "Petrol", 2022,
                Arrays.asList("Hill Hold", "Cruise Control", "ABS")));

        vehicles.add(new Vehicle("MG", "ZS EV", "SUV", 2200000.0, "Electric", 2023,
                Arrays.asList("Voice Control", "360 Camera", "ADAS")));

        vehicles.add(new Vehicle("Mahindra", "Thar", "SUV", 1800000.0, "Diesel", 2022,
                Arrays.asList("4x4 Drive", "Roll Cage", "Waterproof Cabin")));
        
        mapFunction();
        useFlatMap();

    }
}
