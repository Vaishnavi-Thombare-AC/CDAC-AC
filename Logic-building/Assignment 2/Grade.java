public class Grade
{
public static void main(String ar [])
{
int math = 80;
int sci = 85;
int his = 90;

int avg = math + sci + his;

avg/=3;
System.out.println("Average marks :"+avg);

if (avg >= 90)
{
System.out.println("Grade: A");
}
else if (avg >= 70 && avg <=89)
{
System.out.println("Grade: B");
}
else if (avg >= 50 && avg <=69)
{
System.out.println("Grade: C");
}
else if (avg >= 30 && avg <=49)
{
System.out.println("Grade: D");
}

}
}

