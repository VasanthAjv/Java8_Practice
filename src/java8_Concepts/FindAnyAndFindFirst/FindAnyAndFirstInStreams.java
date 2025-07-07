package java8_Concepts.FindAnyAndFindFirst;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyAndFirstInStreams {
	
	
	static List<String> myList = Arrays.asList(
          
            "List: Banana",
            "List: Cherry",
            "List: Mango",
            "List: Grape", 
            "List: Apple"
    );
	
  static  Map<Integer, String> myMap = new HashMap<>();
    
  static  String[] myArray = {
            "Array: Apple",
            "Array: Banana",
            "Array: Cherry",
            "Array: Mango",
            "Array: Grape"
    };
  static String[]myArray1= {};

public static void useFindAny() {
	
	
	 System.out.println("List: " + myList.stream().findAny().orElse("Empty List"));
	    System.out.println("Map: " + myMap.entrySet().parallelStream().findAny().orElse(null));
	    System.out.println("Array: " + Stream.of(myArray).findAny().orElse("Empty Array"));
	    System.out.println("Empty Array1: " + Stream.of(myArray1).findAny().orElseGet(() -> "it happing null"));
	    Optional<String> first = Stream.of(myArray).findAny();
	    System.out.println(first);
	    System.out.println(first.get());
}
public static void useFindFirst() {
    System.out.println("List: " + myList.stream().findFirst().orElse("Empty List"));
    System.out.println("Map: " + myMap.entrySet().stream().findFirst().orElse(null));
    System.out.println("Array: " + Stream.of(myArray).findFirst().orElse("Empty Array"));
    System.out.println("Empty Array1: " + Stream.of(myArray1).findFirst().orElseGet(() -> "it happing null"));
    Optional<String> first = Stream.of(myArray).findFirst();
    System.out.println(first);
    System.out.println(first.get());
}
public static void main(String args[])
{

    myMap.put(1, "Map: Apple");
    myMap.put(2, "Map: Banana");
    myMap.put(3, "Map: Cherry");
    myMap.put(4, "Map: Mango");
    myMap.put(5, "Map: Grape");
    useFindAny();
    System.out.println();
    useFindFirst();

}
}
