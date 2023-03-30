import java.util.Scanner;

class InpKey
{
  public static void main(String arg[])
{ 
  System.out.print("Enter id name Sal: ");
Scanner sc = new Scanner(System.in);

int id =  sc.nextInt();
String name = sc.next();
float sal = sc.nextFloat();

System.out.println("Id = " +id);
System.out.println("Name = " +name);
System.out.println("Sal = " +sal);

}

}