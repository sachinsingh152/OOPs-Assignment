package com.assignmentclass;



import java.util.Scanner;
import java.lang.String;

class In {
    private String pnumber;
    private String descript;
    private int noitem;
    private double price;

    public In(String pnumber, String descript, int noitem, double price) {
        this.pnumber = pnumber;
        this.descript = descript;
        if (noitem < 0) {
            this.noitem = 0;
        } else {
            this.noitem = noitem;
        }
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void display() {
        System.out.println("the part number is :" + pnumber);
        System.out.println("the part description is :" + descript);
    }

    public double getInvoiceAmount() {
        return noitem * price;
    }

}

public class Question2 {
    public static void main(String[] args) 
    {
        System.out.println("enter the data");
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int c = sc.nextInt();
        double d = sc.nextDouble();
        In A = new In(a, b, c, d);
        
        A.display();
        System.out.println("the invoice amount is :" + A.getInvoiceAmount());
        sc.close();
    }
}
