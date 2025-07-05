package java8_Concepts.SortingUsingComparator;

import java.util.*;
import java8_Concepts.SortingUsingComparator.Mobile.Brand;

public class Runner {
    static List<Mobile> sortingList = new ArrayList<>();

    public static void main(String[] args) {
        // 👉 1. Add 10 Mobiles
        addMobiles();

        System.out.println("🔸 Original List:");
        displayMobile();

        // 👉 2. Comparable (Default Sort - by price)
        Collections.sort(sortingList);
        System.out.println("\n🔹 Sorted by Price (Comparable):");
        displayMobile();

        // 👉 3. Comparator with Anonymous Inner Class (Sort by RAM Desc)
        Collections.sort(sortingList, new Comparator<Mobile>() {
            @Override
            public int compare(Mobile m1, Mobile m2) {
                return Integer.compare(m2.memory, m1.memory); // High to low
            }
        });
        System.out.println("\n🔹 Sorted by RAM (Comparator - Anonymous):");
        displayMobile();

        // 👉 4. Comparator using Lambda (Sort by Brand Alphabetical)
        sortingList.sort((m1, m2) -> m1.brand.name().compareTo(m2.brand.name()));
        System.out.println("\n🔹 Sorted by Brand (Lambda):");
        displayMobile();

        // 👉 5. Comparator using Method Reference + Comparator.comparing (Sort by Rating Desc)
        sortingList.sort(Comparator.comparing(Mobile::getRating).reversed());
        System.out.println("\n🔹 Sorted by Rating (Method Reference):");
        displayMobile();
        
        
        Collections.sort(sortingList, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Integer.compare(o1.memory, o2.memory);
			}
        	
        });
    }

    public static void displayMobile() {
        for (Mobile mobile : sortingList) {
            System.out.println(mobile);
        }
    }

    public static void addMobiles() {
        sortingList.add(new Mobile(Brand.APPLE, "I16Pro", 8, 120000.00, 120, 5, "white", 3));
        sortingList.add(new Mobile(Brand.SAMSUNG, "Galaxy S23", 12, 85000.00, 108, 4, "black", 2));
        sortingList.add(new Mobile(Brand.OPPO, "Reno10", 8, 30000.00, 64, 3, "blue", 1));
        sortingList.add(new Mobile(Brand.VIVO, "V29Pro", 12, 32000.00, 64, 4, "purple", 1));
        sortingList.add(new Mobile(Brand.REALME, "GT Neo 3", 8, 29000.00, 50, 4, "black", 2));
        sortingList.add(new Mobile(Brand.ONEPLUS, "11R", 16, 45000.00, 50, 5, "green", 2));
        sortingList.add(new Mobile(Brand.REDMI, "Note 13 Pro+", 12, 27000.00, 200, 4, "silver", 1));
        sortingList.add(new Mobile(Brand.NOKIA, "X30", 6, 22000.00, 50, 3, "blue", 2));
        sortingList.add(new Mobile(Brand.MOTOROLA, "Edge 40", 8, 26000.00, 50, 4, "black", 1));
        sortingList.add(new Mobile(Brand.IQOO, "Neo 7", 8, 28000.00, 64, 4, "orange", 1));
    }
}
