package com.assignmentclass;


import java.util.Scanner;
 
public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the total miles driven per day: ");
        double mile = input.nextDouble();
        
        
        System.out.print("Enter the cost per gallon of gasoline: ");
        double cost = input.nextDouble();
        
        
        System.out.print("Enter your vehicle's average miles per gallon: ");
        double miles = input.nextDouble();
        
        
        System.out.print("Enter the average parking fees per day: ");
        double park = input.nextDouble();
        
       
        System.out.print("Enter the tolls per day: ");
        double toll= input.nextDouble();
        
        
        double gascost = (mile / miles) * cost;
        double total = gascost + park + toll;
        
        System.out.println("The cost for gas is :"+gascost);
        System.out.println("Your total cost of driving per day is: "+ total);
        
        
        input.close();
    }
}