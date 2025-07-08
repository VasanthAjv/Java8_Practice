package java8_Concepts.ReduceInStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
public static void main(String []args)
{
	List<Integer>integer=Arrays.asList(1,2,3,2,3,4,45,2,32);
	Optional<Integer> reduce = integer.stream().reduce((t, u) -> t);
	System.out.println(reduce.get());
}
}
