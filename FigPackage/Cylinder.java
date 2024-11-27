package com.FigPackage;

public class Cylinder extends Figure
{
     private double h;
     public Cylinder(double r,double h){
    	 this.h=h;
    	 this.r=r;
     }
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		a=2*pi*r*r+2*pi*r*h;
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		v=pi*r*r*h;
	}

	@Override
	public void dispArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of the cylinder is :"+a);
	}

	@Override
	public void diapVolume() {
		// TODO Auto-generated method stub
		System.out.println("the volume of the cylinder is "+v);
	}
 
}
