package java8_Concepts.OptionalClass.OptionalAnotherExample;

import java.util.Optional;

public class CreateOptionalObjectExamples {

	
	public static  void testUsingEmpty() {
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isEmpty());
	}
	
	
   public static void testUsingOf()
   {
	   String name="vasanth";
	   Optional<String> of = Optional.of(name);
	   System.err.println(of.isPresent());
   }
   
   public static void testUsingOfNullable() {
	   String name=null;
	   Optional<String> ofNullable = Optional.ofNullable(name);
	   System.out.println(ofNullable.isPresent());
   }
	public static void main(String args[])
	{
		testUsingEmpty();
		testUsingOf();
		testUsingOfNullable();
	}
}
