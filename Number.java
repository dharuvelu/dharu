import java.io.*;
import java.util.*;
class Number
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int Sum=0;
for(int i=1;i<=n;i++)
{
Sum=Sum+i;
}
System.out.print(Sum);
}
}
