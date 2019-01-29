package com.app;

public class StrRev {
	public static void main(String[] args) {
		String orginal="riyaz";
		String rev="";
		for(int i=orginal.length()-1;i>=0;i--) {
			rev=rev+orginal.charAt(i);		
		}
		System.out.println(rev);
	}
}
