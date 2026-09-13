public class Triangle {
int side1 ;
int side2 ;
int side3 ;

Triangle(int a,int b,int c)
{
	side1 = a;
	side2 = b;
	side3 = c;
}
void perimeter()
{
	int perimeter = side1 + side2 +side3;
	System.out.println("Perimeter of Triangle "+perimeter);
}
void area()
{
	int area = (side1 * side2)/2;
	System.out.println("Area of Triangle "+area);
}
}
