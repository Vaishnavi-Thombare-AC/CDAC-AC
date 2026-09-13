
public class Complex 
{ 
	int real;
	int imag;
	
	
	public void sum (Complex c,Complex c1)
	{
				
			 
			System.out.println("SUM = "+(c.real + c1.real) +"+"+(c.imag + c1.imag)+"i");
	}
	public void difference(Complex c,Complex c1)
	{
		System.out.println("Differernce = "+ (c.real - c1.real)+"+"+(c.imag - c1.imag)+"i");
		
	}
	public void product(Complex c ,Complex c1)
	{
		System.out.println("Product = "+ (c.real * c1.real)+"+"+(c.imag * c1.imag)+"i");

	}
}
