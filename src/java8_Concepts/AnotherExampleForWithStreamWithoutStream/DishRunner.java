package java8_Concepts.AnotherExampleForWithStreamWithoutStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8_Concepts.AnotherExampleForWithStreamWithoutStream.Dish.Type;

public class DishRunner {
	
	static List<Dish>dishList=new ArrayList<>();
public static void main(String []args)
{
	dishList.add(new Dish("star fish",false,Type.CURRY,120));
	dishList.add(new Dish("Star Fish", false, Type.CURRY, 120));
	dishList.add(new Dish("Paneer Butter Masala", true, Type.CURRY, 250));
	dishList.add(new Dish("Chicken Biryani", false, Type.RICE, 500));
	dishList.add(new Dish("Gulab Jamun", true, Type.DESSERT, 300));
	dishList.add(new Dish("Veg Pulao", true, Type.RICE, 320));
	dishList.add(new Dish("Mutton Gravy", false, Type.CURRY, 450));
	dishList.add(new Dish("French Fries", true, Type.SNACK, 280));
	dishList.add(new Dish("Fish Fry", false, Type.SNACK, 350));
	dishList.add(new Dish("Mango Lassi", true, Type.DRINK, 180));
	dishList.add(new Dish("Chicken Kabab", false, Type.SNACK, 400));
	usingJava8();
	String str= isVege();
	System.out.println(str);
	
}

public static void lowTohighAndIsVegeterian() {
	List<Dish>isVeg=new ArrayList<>();
	for(Dish d:dishList)
	{
		if(!d.isVegetarian())
		{
			isVeg.add(d);
		}
	}
	Collections.sort(isVeg,new Comparator<Dish>() {

		@Override
		public int compare(Dish o1, Dish o2) {
			return Integer.compare(o1.getPrice(), o2.getPrice());
		}
		
	});
	for(Dish d:isVeg)
	{
		System.out.println(d);
	}
}

public static String isVege() {
	return dishList.stream()
	.filter(Dish::isVegetarian)
	.sorted(Comparator.comparing(Dish::getPrice).reversed()).map(n->n.getDishName()).collect(Collectors.joining("||"));
	
}

public static void usingJava8() {
	List<String> usingjava=dishList.stream().filter(n->n.isVegetarian()==false)
	.sorted(Comparator.comparing(Dish::getPrice).reversed())
	.map(n->n.getDishName())
	.collect(Collectors.toList());
	System.out.println(usingjava);
}
}
