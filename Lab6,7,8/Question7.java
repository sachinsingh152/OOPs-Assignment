package com.assignmentclass;

import java.util.Random;

public class Question7 {
   private enum Status{CONTINUE ,WIN,LOSS}
   
    static Random random=new Random();
    static int roldice(){
    	int x=1+random.nextInt(6);
    	int y=1+random.nextInt(6);
    	int z=x+y;
    	System.out.println("player rolled "+x+" and "+y);
    	return z;
    }
	public static void main(String[] args) {
		Status gstatus;
	 int point=0;
	 int sumofdice=roldice();
	 switch(sumofdice) {
	 case 7:
	 case 11:
		 gstatus=Status.WIN;
		 break;
	 case 2:
	 case 3:
	 case 12:
		 gstatus=Status.LOSS;
		 break;
	default:
		gstatus=Status.CONTINUE;
		point=sumofdice;
		System.out.println("point is "+point);
		break;
		
	 }
	 while(gstatus==Status.CONTINUE) {
		 sumofdice=roldice();
		 if(sumofdice==point) {
			 gstatus=Status.WIN;
		 }
		 else if(sumofdice==7) {
			 gstatus=Status.LOSS;
		 }
	 }
	 if(gstatus==Status.WIN) {
		 System.out.println("player won");
	 }

	 else {
		 System.out.println("player lose");
	 }
	}

}
