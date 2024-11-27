package com.FigPackage;

public class Cone extends Figure
{
     private double h;
	
	public Cone(double r,double h) {
		this.r=r;
		this.h=h;
	}
	public void calcArea() {
		a=pi*r*(r+Math.sqrt(h*h+r*r));
	}

	@Override
	public void calcVolume() {
	   v=(1.0/3.0)*pi*r*r*h;
		
	}

	@Override
	public void dispArea() {
		System.out.println("the area of the cone is :"+a);
		
	}

	@Override
	public void diapVolume() {
	 System.out.println("the volume of the cone is :"+v);
		
	}

	

	

}
