import java.util.*;
public class Kaprekar
{
public static void main(String args[])
{
int num,t,r,sq,count=0,a,qt,rm;
System.out.println("enter a number");
num=sc.nextInt();
t=num;
sq=num*num;
while(num>0)
{
r=num%10;
count++;
num=num/10;
}
qt=sq/(int)Math.pow(10,count);
rm=sq%(int)Math.pow(10,count);
if(qt+rm==t)
System.out.println("kaprekar number");
else
System.out.println("not a kaprekar number");
}
}


