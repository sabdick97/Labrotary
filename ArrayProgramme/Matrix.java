import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int ar[][]= new int [3][3];
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("enter element");
ar[i][j]=sc.nextInt();
}
}
//Display matrix
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)

{
System.out.print(ar[i][j]+ "    ");
}
System.out.println();
}

//sum of all elements
int sum=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
//if(i==j)
if(i+j==ar.length-1)

{
sum=sum+ar[i][j];
}
}
}
System.out.println("Sum of Matrix: " +sum);

}

}
