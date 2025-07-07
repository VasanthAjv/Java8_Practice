package java8_Concepts.FlatMapInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherFlatMapExample {
public static void main(String args[]) {
	List<String>marvel=Arrays.asList("captian america","Iron man","thaanos","root","thor");
	List<String>dc=Arrays.asList("Spiderman","Flash","Batman","Superman");
	List<String>xMen=Arrays.asList("Wolverine","Magneto","Professor X");
	List<List<String>>superheros=Arrays.asList(marvel,dc,xMen);
	List<String>str=superheros.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(str);    str.forEach(System.out::println);
}
}
