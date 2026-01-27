// Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied values. Also, implement a copy constructor to create a new Point object as a copy of an existing Point object. Include a display() method to show the point's coordinates and write a main method to test all constructors and the display functionality. //

class Point12
{
	int x;
	int y;

	Point12()
	{
		x=5;
		y=5;
	}

	Point12(int a, int b)
	{
		x=a;
		y=b;
	}

	Point12(Point12 P)
	{
		x=P.x;
		y=P.y;
	}

	void display()
	{
		System.out.println("Point coordinates: (" + x + ", " + y + ")");
	}

	public static void main(String[] args)
	{
		System.out.println("250393107008");
		Point12 P1= new Point12();
		P1.display();
		
		Point12 P2= new Point12(10,20);
		P2.display();

		Point12 P3= new Point12(P2);
		P3.display();

		
	}
}