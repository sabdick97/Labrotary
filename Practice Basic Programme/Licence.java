import java.util.*;
public class Licence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double h,l;
System.out.println(" enter horse power");
h=sc.nextDouble();
if (h<=50)
l=0;
else if (h>50 && h<=100)
l=300;
else if (h>100 && h<=200)
l=600;
else if (h>200 && h<=300)
l=900;
else 
l=1000;
System.out.println ("the licence is"+ l);

}

}
