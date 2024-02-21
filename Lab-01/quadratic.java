import java.util.Scanner;
import java.lang.Math;
class quadratic
{
public static void main(String xx[])
{
float a,b,c,d,r1,r2;
Scanner s1=new Scanner(System.in);
System.out.println("enter the coefficients");
a=s1.nextFloat();
b=s1.nextFloat();
c=s1.nextFloat();
d=b*b-(4*a*c);
if(d>0)
{
r1=(-b+(float)Math.sqrt(d))/(2*a);
r2=(-b-(float)Math.sqrt(d))/(2*a);
System.out.println("r1="+r1);
System.out.println("r2="+r2);
}
else if(d==0)
{
r1=(-b)/(2*a);
r2=(-b)/(2*a);
System.out.println("r1="+r1);
System.out.println("r2="+r2);
}
else
{
r1=(float)Math.sqrt(-d)/(2*a);
r2=-1*r1;
System.out.println("roots:\n"+"r1="+(-b/(2*a))+"+"+r1+"i"+"\nr2="+(-b/(2*a))+r2+"i");
}
}
}