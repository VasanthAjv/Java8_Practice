package java8_Concepts.AnonymousCheckingHiddenFilesExample;

import java.io.File;
import java.io.FileFilter;

public class Runner {

	public static void main(String[] args) {

		
		File[] fileList=new File("C://").listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				System.out.println(pathname.isDirectory());
				return pathname.isHidden();
			}
			
		});
		for(File a:fileList)
		{
			System.out.println(a);
		}
	}

}
