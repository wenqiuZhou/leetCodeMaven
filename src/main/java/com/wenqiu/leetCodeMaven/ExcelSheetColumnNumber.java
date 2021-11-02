package com.wenqiu.leetCodeMaven;

public class ExcelSheetColumnNumber {
	  public int titleToNumber(String columnTitle) {
	      int len= columnTitle.length(); 
	      char[] columnArray=columnTitle.toCharArray();
	      int result=0;
	      for(int i=0;i<len;i++){
	    	 result+= Math.pow(26, len-1-i)*(columnArray[i]-64);
	      }
	      return result;
	    }
}
