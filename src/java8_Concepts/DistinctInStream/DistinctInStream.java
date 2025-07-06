package java8_Concepts.DistinctInStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctInStream {
public static void main(String []args)
{
   List<String>list=new ArrayList<>(Arrays.asList("vasanth","arun","abi","avin","rose","avin","vasanth"));
  List<String>st= list.stream().distinct().collect(Collectors.toList());
  System.out.println(st);
  System.out.println(list.stream().distinct().collect(Collectors.toList()));
  list.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
}
}
