
public class Employee 
{
	double salary;
	int hours;
	void getInfo(double sal,int hrs)
	{
		salary = sal;
		hours = hrs;
	}
	
	
	void addSal()
	{
		if(salary<500)
		{
			salary+=10;
		}
	}
	void addWork()
	{
		if(hours>6)
		{
			salary+=5;
		}
	}
	void printAll()
	{
		System.out.println("salary of Employee "+salary);	

	}
}
