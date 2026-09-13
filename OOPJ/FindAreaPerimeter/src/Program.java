
public class Program {

	public static void main(String[] args) {
Triangle obj = new Triangle(3,4,5);
obj.perimeter();
obj.area();

Rectangle rect1 = new Rectangle(4,5);
Rectangle rect2 = new Rectangle(5,8);

System.out.println("Length ="+rect1.length+"\nBreadth ="+rect1.breadth+"\nArea ="+rect1.area());
System.out.println("Length ="+rect2.length+"\nBreadth ="+rect2.breadth+"\nArea ="+rect2.area());

	}

}
