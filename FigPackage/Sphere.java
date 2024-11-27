package com.FigPackage;

public class Sphere extends Figure
{
    public Sphere(double r) {
    	this.r=r;
    }
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		a=pi*r*r*4.0;
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		v=(4.0/3.0)*r*r*r;
	}

	@Override
	public void dispArea() {
		// TODO Auto-generated method stub
		System.out.println("the area of the sphere is :"+a);
	}

	@Override
	public void diapVolume() {
		// TODO Auto-generated method stub
		System.out.println("the volume of the sphere is"+v);
	}
    
}
