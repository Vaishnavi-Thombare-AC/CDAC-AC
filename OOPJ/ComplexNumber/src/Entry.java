
public class Entry {

	public static void main(String[] args) {
				
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		System.out.println("Enter real1");
		c1.real = ConsoleInput.getInt();
		System.out.println("Enter imaginary1 number");
		c1.imag = ConsoleInput.getInt();
		System.out.println("Enter real2");
		c2.real = ConsoleInput.getInt();
		System.out.println("Enter imaginary2 number");
		c2.imag = ConsoleInput.getInt();
		c1.sum(c1, c2);
		c1.difference(c1, c2);
		c1.product(c1,c2);
	
		}

}
