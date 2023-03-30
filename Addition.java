import java.lang.*;
import java.util.*;
import java.io.*;

class Addition
{
 
 public static void main(String arg[])throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  System.out.print("Enter Two number:");
  String str = br.readLine();
 

 StringTokenizer st = new StringTokenizer(str, ",");

 String s1 = st.nextToken(); 
 String s2 = st.nextToken();
 
 s1 = s1.trim();
 s2 = s2.trim();

 double n1 = Double.parseDouble(s1);
 double n2 = Double.parseDouble(s2);

System.out.println("Result of Addition is : " +(n1+n2));
System.out.println("Result of Subtraction is :" +(n1-n2));
System.out.println("Result of Multiplication is: " +(n1*n2));
System.out.println("Result of Division is:"+(n1/n2));




}
}