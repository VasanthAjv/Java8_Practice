package java8_Concepts.SortingUsingComparator;

import java.util.Comparator;

public class SortingByPrice  implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
	    return Integer.compare(o1.megapixel,o2.megapixel);
	}
	
	

}
