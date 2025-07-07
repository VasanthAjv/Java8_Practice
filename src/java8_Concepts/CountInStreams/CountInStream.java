package java8_Concepts.CountInStreams;

import java.util.Arrays;
import java.util.List;

public class CountInStream {
public static void main(String args[])
{
	List<String>list=Arrays.asList("lion","Tiger","cheetah","monkey","deer","elephant");
	list.stream().map(String::length).forEach(System.out::print);
	
	Long count=list.stream().count();
	System.out.println(count);
}
}