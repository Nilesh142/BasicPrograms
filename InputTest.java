import java.util.*;

public class InputTest
{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
 
      //get first Input
    System.out.print("What is your Name?");
    String name = in.nextLine();
   
    //get second input
   System.out.print("How old are you?");
   int Num = in.nextInt();

    //display output on console
   System.out.println("Hello,"+name+". Next Year, You'll be"+(Num+1));
 
   System.out.printf("%tc",new Date());


  }
}