import java.util.Scanner;
class Circle
{
		double radius;
		double radius1;
		String colour;

		void setRadius(double rs)//Here, rs is user input radius.
		{
			radius=rs;
		}
		double getRadius()
		{
			resetToPreviousRadius();
			radius1=radius;
			return radius1;
		}
		void setColour(String col)//Here, col is user input colour.
		{
			resetToPreviousColour();
			colour=col;
		}
		String getColour()
		{
			return colour;
		}
		double getCircumference()
		{
			double C=2*(3.142)*radius;
			return C ;
		}
		double getArea()
		{
			double A=(3.142)*radius*radius;
			return A ;
		}
		void decrementRadiusBy(double n2)
		{
			radius=radius-n2;
		}
		void incrementRadiusBy(double n4)
		{
			radius=radius+n4;
		}
		void resetToPreviousColour()
		{
			System.out.println("Previous Colour :"+colour);
		}
		void resetToPreviousRadius()
		{
			System.out.println("Previous Radius :"+radius1);
		}
}

class MainCircle
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		Scanner sc=new Scanner(System.in);

		System.out.print("Radius :");
		double r=sc.nextDouble();
		c.setRadius(r);
		c.getRadius();

		System.out.print("Colour :");
		String cr=sc.next();
		c.setColour(cr);
		c.getColour();

		c.getCircumference();
		c.getArea();

		System.out.print("decrement Radius :");
		double n1=sc.nextDouble();
		c.decrementRadiusBy(n1);

		System.out.print("Increment Radius :");
		double n3=sc.nextDouble();
		c.incrementRadiusBy(n3);

		System.out.println("Current Radius of the Circle in Centimeter :"+c.radius);
		c.getRadius();
		System.out.println("Current Circumference in centimeter :"+c.getCircumference());
		System.out.println("Current Area in square centimeter :"+c.getArea());

		System.out.print("Change the Colour :");
		String cr1=sc.next();
		c.setColour(cr1);
		c.getColour();

		System.out.println("Current Colour of the Circle :"+c.colour);

	}
}































