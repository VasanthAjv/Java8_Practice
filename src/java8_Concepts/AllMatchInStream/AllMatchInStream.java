package java8_Concepts.AllMatchInStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AllMatchInStream {
public static void main(String args[])
{
	Map<String,String>anymatch=new HashMap<>();
	anymatch.put("vasanth", "silent");
	anymatch.put("surya", "shout");
	anymatch.put("arun", "shout");
	anymatch.put("akash", "silent");
	anymatch.put("appa", "shout");
	anymatch.put("avin", "silent");
	
	String[]str= {"hi vasanth from thanjai"," hello mine from chennai"};
boolean l=	Arrays.stream(str).allMatch(sentence->sentence.contains("i"));
	System.out.println(l);
	Map<String,Boolean>h=Arrays.stream(str).collect(Collectors.toMap(sentence->sentence, sentence->sentence.contains("i")));
   System.out.println(h);
}
}
