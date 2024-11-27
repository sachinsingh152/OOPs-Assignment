package com.assignmentclass;


import java.util.Scanner;
class Date{
    private int month;
     private  int day;
    private int year;
    Date(int month,int day,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void getData(){
        System.out.println("the day is :"+day);
        System.out.println("the month is :"+month);
        System.out.println("the year is :"+year);
    }
    void displayDate(){
        System.out.print(day);
        System.out.print("/ "+month);
        System.out.print("/ "+year);
    }


}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the month ");
        a=sc.nextInt();
        System.out.println("Enter the day ");
        b=sc.nextInt();   
         System.out.println("Enter the year ");
        c=sc.nextInt();
        Date A=new Date(a,b,c);
        A.getData();
        A.displayDate();
        sc.close();
    }
}

