package com.assignmentclass;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String s=sc.next();
		System.out.println("Enter the frequency :");
		int x=sc.nextInt();
		int[] a=new int[26];
		int n=s.length();
		for(int i=0;i<n;i++) {
			a[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(a[i]>x) {
				System.out.print((char)('a'+i)+"  ");
			}
		}
        sc.close();
	}

}
