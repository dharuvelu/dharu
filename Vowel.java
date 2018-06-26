import java.io.*;
import java.util.*
class Vowel
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b="aeiou";
for(int i=0;i<a.length();i++)
{
for(int j=0;j<b.length();b++)
{
if((a.charAt(i))==(b.charAt(j)))
{
System.out.print("vowel");
}
else
{
count++;
}
}
}
}
}
