import java.io.*;

class LeapYear
{
   public static void main(String arg[])throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter Year: ");
int year = Integer.parseInt(br.readLine());

if((year % 100 == 0)&&(year % 400 == 0))
{
System.out.print("It is Leap Year");
}
else if((year % 100 != 0)&&(year % 4 == 0))
{
System.out.print("It is Leap Year ");
 }
else
{
 System.out.print("It is not Leap Year ");
}

}
}
