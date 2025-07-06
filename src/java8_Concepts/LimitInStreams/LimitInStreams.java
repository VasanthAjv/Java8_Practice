package java8_Concepts.LimitInStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LimitInStreams {
public static void main(String args[])
{
	List<String>Countries =new ArrayList<>(Arrays.asList("India","Australia","USA","China","Japan"));
	 Countries.stream().limit(100).forEach(System.out::println);//limit(100)->it is maximum limit for given manually
	 
	// Countries.stream().limit(-1).forEach(System.out::println);
	 // it will through the exception of illegalExcepction because of limit -1

}
}
