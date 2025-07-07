package java8_Concepts.LimitInStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipInStreams {
public static void main(String []args)
{
	List<String>Countries =new ArrayList<>(Arrays.asList("India","Australia","USA","China","Japan"));
	Countries.stream().skip(2).forEach(System.out::print);
}
}
