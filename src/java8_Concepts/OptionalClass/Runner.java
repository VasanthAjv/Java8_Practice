package java8_Concepts.OptionalClass;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
            new Person("Vasanth", new Car("Audi", "A8", 2023, "Petrol", 1200000, "Blue", true),
                    new Insurance("POL001", "Vasanth", "LIC", "Car", 500000, 20000, "2023-01-01", "2026-01-01", true)),

            new Person("Arun", null,
                    new Insurance("POL002", "Arun", "HDFC", "Car", 700000, 25000, "2022-05-01", "2025-05-01", true)),

            new Person("Surya", new Car("Hyundai", "i20", 2021, "Petrol", 700000, "White", true),
                    null),

            new Person("Priya", null,
                    null),

            new Person("Karthik", new Car("Kia", "Seltos", 2020, "Petrol", 900000, "Red", false),
                    new Insurance("POL005", "Karthik", "LIC", "Car", 550000, 21000, "2020-06-01", "2023-06-01", false)),

            new Person("Anu", new Car("Mahindra", "XUV700", 2023, "Diesel", 1400000, "Grey", true),
                    new Insurance("POL006", "Anu", "TATA AIG", "Car", 800000, 27000, "2023-04-01", "2026-04-01", true)),

            new Person("Ravi", null,
                    new Insurance("POL007", "Ravi", "Bajaj Allianz", "Car", 750000, 26000, "2021-07-01", "2024-07-01", true)),

            new Person("Lakshmi", new Car("Honda", "City", 2022, "Petrol", 950000, "Blue", true),
                    null),

            new Person("Sathish", null,
                    null),

            new Person("Deepa", new Car("Ford", "Ecosport", 2021, "Diesel", 800000, "Brown", true),
                    new Insurance("POL010", "Deepa", "New India", "Car", 400000, 19000, "2021-10-01", "2024-10-01", true))
        );

        people.forEach(System.out::println);
    }
}
