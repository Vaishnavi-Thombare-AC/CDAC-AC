
public class Entry {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		System.out.println("Name \t Year of Joining \t Salary \t Address");

		emp1.Display("Robert",1994,10000,"64C- WallsStreat");
		emp2.Display("sam",2000,20000," 68D- WallsStrea");
		emp3.Display("John",1999,50000," 26B- WallsStrea");
	}

}
