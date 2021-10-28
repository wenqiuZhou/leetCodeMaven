package com.wenqiu.test.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DataProviderFromCSVFile {
	public List<String> getLines(String fileName){
		
		ClassLoader classLoader = this.getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		Scanner sc=null;
		try {
			sc = new Scanner(file);
			sc.next();
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		//sc.useDelimiter(",");
		
		sc.close();
		
		return null;
		
	}

}
