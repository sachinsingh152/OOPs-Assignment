package com.FigPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cone cone=new Cone(5,10);
         cone.calcArea();
         cone.calcVolume();
         cone.dispArea();
         cone.diapVolume();
         Sphere sphere=new Sphere(7);
         sphere.calcArea();
         sphere.calcVolume();
         sphere.dispArea();
         sphere.diapVolume();
         Cylinder cylinder=new Cylinder(4,8);
         cylinder.calcArea();
         cylinder.calcVolume();
         cylinder.dispArea();
         cylinder.diapVolume();
         
	}

}
