import java.util.Scanner;
import java.io.*;

class Avg
{
 public static void main(String arg[])
{
  System.out.println("Enter The Number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for(int i=1;i <= n;i++)
{
 for(int j=0;j <=n;j++)
 {
  System.out.print(j+i+" ");
 }
System.out.println();
}
}
}