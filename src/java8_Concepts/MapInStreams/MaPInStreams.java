package java8_Concepts.MapInStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaPInStreams {

	static List<Family> familyList = new ArrayList<>();
public static void main(String[] args)
{

	familyList.add(new Family("Vasanth", "brother", 2500.00, 2));
	familyList.add(new Family("Karthik", "father", 5500.00, 1));
	familyList.add(new Family("Radha", "mother", 4800.00, 1));
	familyList.add(new Family("Dinesh", "cousin", 1800.00, 3));
	familyList.add(new Family("Meena", "sister", 2300.00, 1));
	familyList.add(new Family("Ravi", "uncle", 3400.00, 2));
	familyList.add(new Family("Latha", "aunt", 2900.00, 1));
	familyList.add(new Family("Suresh", "grandfather", 3100.00, 1));
	familyList.add(new Family("Lakshmi", "grandmother", 2700.00, 1));
	familyList.add(new Family("Arun", "brother-in-law", 3600.00, 2));
 findName();
	
}
public static void findName() {
	String str=familyList.stream().filter(family->{
		char firstChar=Character.toLowerCase(family.getFname().charAt(0));
		return firstChar>='b' && firstChar<='v';
	}).sorted(Comparator.comparing(Family::getFname)).map(Family::getFname)
	.collect(Collectors.joining(","));
	System.out.println();
}
}
