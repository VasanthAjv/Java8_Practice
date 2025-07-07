package java8_Concepts.AnyMatchInStream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NoneMatchInStreams {
public static void main(String args[])
{
	Map<String,String>anymatch=new HashMap<>();
	anymatch.put("vasanth", "silent");
	anymatch.put("surya", "shout");
	anymatch.put("arun", "shout");
	anymatch.put("akash", "silent");
	anymatch.put("appa", "shout");
	anymatch.put("avin", "silent");
	
	boolean nonematch=anymatch.entrySet().stream().noneMatch(n->n.getKey().startsWith("o"));
	System.out.println(nonematch);
	
	
	Map<String,String>str=anymatch.entrySet().stream()
			.collect(Collectors.toMap(n->n.getKey()+"_"+n.getValue(), n->n.getValue()));
	        System.out.println(str);
}
}
