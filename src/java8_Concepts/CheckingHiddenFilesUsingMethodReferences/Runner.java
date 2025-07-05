package java8_Concepts.CheckingHiddenFilesUsingMethodReferences;

import java.io.File;


public class Runner {
public static void main(String args[]) {

	File[] fileList=new File("C://").listFiles(File::isHidden);
	for(File a:fileList)
	{
		System.out.println(a);
	}
}
}
