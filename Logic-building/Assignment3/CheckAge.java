import java.util.Scanner;
public class CheckAge
{
static void checkAgeCategory(int age)
{
if (age > 1 && age < 18)
{
System.out.println("You are minor");
}
else if(age >= 18 && age < 60)
{
System.out.println("You are an adult");
}
else
System.out.println("You are senior citizen");
}
public static void main(String ar [])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the age : ");
int age = sc.nextInt();
CheckAge.checkAgeCategory(age);
}
}
