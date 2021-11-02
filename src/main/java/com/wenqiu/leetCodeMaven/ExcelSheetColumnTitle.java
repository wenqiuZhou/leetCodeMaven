package com.wenqiu.leetCodeMaven;

public class ExcelSheetColumnTitle {
	 public String convertToTitle(int columnNumber) {
		 StringBuilder sb=new StringBuilder();
	        int result=columnNumber;
	        int mode;
	        while(result>26) {
	        	mode=result%26;
	        	if(mode==0) {
	        		mode=mode+26;
	        		result=result-1;
	        	}
	        	sb.append((char)(mode+64));
	        	result=result/26;
             
	        }
	        if(result>0){
             sb.append((char)(result+64));
         }
	        return sb.reverse().toString();
	    }
}
