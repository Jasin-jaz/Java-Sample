import java.lang.Math.*;
import java.io.*;
class Circle
{
	double radius;
	Circle()
	{}
	Circle(double r)
	{
		radius=r;
	}
	double area()
	{
		return (Math.PI*radius*radius);
	}
}
class cylinder extends Circle
{
	double height;
	cylinder(double r,double h)
	{
	radius=r;
	height=h;
	}
	double volume()
	{
	return (area()*height);
	}
	public static void main(String[] args)
	{
	cylinder c=new cylinder(5.0,8.0);
	System.out.println("Radius:"+c.radius);
	System.out.println("Height:"+c.height);
	System.out.println("Volume:"+c.volume());
	}
}
