class Practical9
{
	double width=1;
	double height=1;
	Practical9()
	{
		
	}

	
	Practical9(double w,double h)
	{
		width=w;
		height=h;	
	}
	
	double getArea()
	{
		return(width*height);
	}

	double getPerimeter()
	{
		return 2*(width+height);
	}

	public static void main(String[]args)
	{
		RectangleP9 r1=new RectangleP9();
		System.out.println("Area of Rectangle:"+r1.getArea());
		System.out.println("Perimeter of Rectangle:"+r1.getPerimeter());

		RectangleP9 r2=new RectangleP9(7,9);
		System.out.println("Area of Rectangle:"+r2.getArea());
		System.out.println("Perimeter of Rectangle:"+r2.getPerimeter());
	}
}