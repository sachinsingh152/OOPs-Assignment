package com.assignmentclass;


import java.util.Scanner;

class Record{
	int distance;
	int gallon;
	static int tdistance=0;
	static int tgallon=0;
	Record(int distance,int gallon){
		this.distance=distance;
		this.gallon=gallon;
		tdistance=tdistance+distance;
		tgallon=tgallon+gallon;
	}
	double getMialege() {
		double s=(double)gallon/distance;
		return s;
	}
	static double getMialeg() {
		return (double)tgallon/tdistance;
	}
	 
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of entries:");
		 int n=sc.nextInt();
		 Record[] a=new Record[n];
		 for(int i=0;i<n;i++) {
			 System.out.println("Enter the distance travelled in "+i+1+" trip:");
			 int x=sc.nextInt();
			 System.out.println("Enter the total gallon :");
			 int y=sc.nextInt();
			 a[i]=new Record(x,y);
		 }
		System.out.println(Record.getMialeg()+"  gallon per miles"); 
		 sc.close();

	}

}

