package com.assignmentclass;

import java.util.Scanner;

interface Function{
	int evalute(int n);
}
class Half implements Function{

	@Override
	public int evalute(int n) {
		// TODO Auto-generated method stub
		return n/2;
	}
	
}
public class Question13 {
	public static int[] halfArray(int[] ar) {
		int[] a=new int[ar.length];
		Half h=new Half();
		for(int i=0;i<ar.length;i++) {
			a[i]=h.evalute(ar[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array :");
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int[] res=halfArray(ar);
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
		sc.close();
		
		

	}

}
