package com.assignmentclass;

import java.util.Scanner;

public class Question9 {
	static boolean firstc(String s) {
		boolean lcase=false;
		boolean digit=false;
		int n=s.length();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				lcase=true;
			}
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				digit=true;
			}
			if(lcase&&digit) return true;
		}
		return false;
	}
	static boolean secondc(String s) {
		int n=s.length();
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)||!Character.isLetterOrDigit(c)) {
				return false;
			}
		}
		return true;
	}
	static boolean pattern(String s) {
		int n=s.length();
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n/2;j++) {
				if(i+2*j<n) {
			   String fpair=s.substring(i,i+j);
			   String spair=s.substring(i+j,i+2*j);
			   if(fpair.equals(spair)) {
				   return false;
			   }
			}}
		}
		return true;
	}
    static boolean check(String s ) {
    	return(firstc(s)&&secondc(s)&&(s.length()>=5&&s.length()<=12)&&pattern(s));
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password: ");
	    String s= sc.next();
	    boolean result=check(s);
	    if(result) {
	    	System.out.println("the password is accepted");
	    }
	    else {
	    	System.out.println("the password is not accepted");
	    }
		
       sc.close();
	}

}
