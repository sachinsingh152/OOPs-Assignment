package com.assignmentclass;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the pattern you want to check :");
        String s=sc.next();
        int count=0;
        for(int i=x;i<=y;i++) {
        	String a=Integer.toString(i);
        	if(a.contains(s)) {
        		count++;
        	}
        }
        System.out.println("the frequency of the pattern is : "+count);
        sc.close();
	}

}
