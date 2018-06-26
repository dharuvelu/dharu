import java.io.*;
import java.util.*;
class Alpla
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b="abcdefghijklmnopqrstuvwxyz";
for(int i=0;i<a.length();i++)
{
for(int j=0;j<b.length();j++)
{
if(a.charAt(i)==b.charAt(j))
{
System.out.print("Alphabet");
}
else
{
System.out.print(No Alphabet");
}
}
}
}
}
