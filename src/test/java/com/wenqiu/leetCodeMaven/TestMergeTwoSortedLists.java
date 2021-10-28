package com.wenqiu.leetCodeMaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wenqiu.test.tools.DataProviderFromCSVFile;

@Test
public class TestMergeTwoSortedLists {
	String parenthese;
	@BeforeTest
	public void readData() {
		ClassLoader classLoader = this.getClass().getClassLoader();
		File file = new File(classLoader.getResource("users.csv").getFile());

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
	}

	public void testValidParenthese(){
		DataProviderFromCSVFile dp=new DataProviderFromCSVFile();
		dp.getLines("users.csv");
		
	}
}
