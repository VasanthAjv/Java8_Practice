package java8_Concepts.AnyMatchInStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AnyMatchInStreams {

	public static void main(String[] args) {

		Map<String,String>anymatch=new HashMap<>();
		anymatch.put("vasanth", "silent");
		anymatch.put("surya", "shout");
		anymatch.put("arun", "shout");
		anymatch.put("akash", "silent");
		anymatch.put("appa", "shout");
		anymatch.put("avin", "silent");
	
//if anyone is silent here
Map<String,String>whoIsSilent=anymatch.entrySet().stream()
.filter(entry->entry.getValue().equalsIgnoreCase("silent"))
.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
System.out.println(whoIsSilent);

		
//if any one is shouting here
boolean shoutingStudent=anymatch.entrySet().stream().anyMatch(entry->entry.getValue().equalsIgnoreCase("shout"));

String str=anymatch.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.joining(","));
System.out.println(str);
String[]names=str.split(",");
for(String name:names)
{
	System.out.println(name+ " ");
}




Map<String,String>updated=anymatch.entrySet().stream()
.collect(Collectors.toMap(Map.Entry::getKey,entry->entry.getValue().toUpperCase()));

System.out.println(updated);
	}

	

}
