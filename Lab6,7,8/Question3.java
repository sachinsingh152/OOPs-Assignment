package com.assignmentclass;

import java.lang.String;
class Employee{
    private String name;
    private String lastName;
    private double salary;
    public Employee(String name,String lastName,double salary){
        this.name=name;
        this.lastName=lastName;
        if(salary<0) {
        	this.salary=0;
        }
        else {
        this.salary=salary;}
    }


    public void getInformation(){
        System.out.println("the name of the of the employee is :"+name);
        System.out.println("the last name is :"+ lastName);
        System.out.println("the salary is "+ salary);
    }
    public void hike(){
        salary=salary*1.1;
        System.out.println("the hiked salary is :"+salary);
    }
}
public class Question3 {
 
     
    public static void main(String[] args) {
      
        Employee a=new Employee("Sachin","singh",100000.0);
        Employee b=new Employee("tara","chand",150000.0);
        a.getInformation();
        b.getInformation();
        a.hike();
        b.hike();
    }
}
