import java.io.*;

class NumberSort
{
  public static void main(String arg[])throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("How many Elements: ");
int n = Integer.parseInt(br.readLine());
int arr[] = new int[n];

for(int i=0;i<n;i++)
{
 System.out.print("Enter Int : ");
 arr[i] = Integer.parseInt(br.readLine());
}

int limit = n-1;
boolean flag =false;
int temp;

for(int i =0;i<limit;i++)
{
 for(int j =0;j<limit;j++)
  {
    if(arr[j] > arr[j+1])
      {
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        flag = true;
       }
   }
 if (flag == false)break;
else flag = false;
}

System.out.println("The Sorted array is: ");
for(int i =0;i<n;i++)
System.out.println(arr[i]);
}
}