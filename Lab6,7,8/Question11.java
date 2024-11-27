package com.assignmentclass;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String s=sc.next();
		int n=s.length();
		
		
		int[] a=new int[26];
		for(int i=0;i<n;i++) {
			a[s.charAt(i)-'a']++;
		}
		int flag=0;
		for(int i=0;i<26;i++) {
			if(a[i]>1) {
				System.out.println("this is not a perfect string ");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("this is a perfect string");
		}
		
		sc.close();
	}

}
