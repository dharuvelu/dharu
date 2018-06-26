import java.io.*;
import java.util.*;
class Large
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in)
int a=sc.nextInt();
String b=String.valueOf(a);
char c[]=b.toCharArray();
Arrays.sort(c);
int d=c.length;
System.out.print(c[d]);
}
}
