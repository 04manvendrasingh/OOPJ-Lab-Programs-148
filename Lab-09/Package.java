package CIE;
import java.util.Scanner;
public class Student{
public String usn;
public String name;
public int sem;

public void accept(){
Scanner s = new Scanner(System.in);
System.out.println("Enter Name:");
this.name = s.nextLine();
System.out.println("Enter usn:");
this.usn = s.nextLine();
System.out.println("Enter sem");
this.sem = s.nextInt();
}
public void display(){
System.out.println("Name: " + this.name + "\nUSN: " + this.usn + "\nSem: " + this.sem);
}
}

package CIE;
import java.util.Scanner;
public class Internal extends CIE.Student{
public int m[] = new int[5];
CIE.Student student = new CIE.Student();
public void accept(){
student.accept();
Scanner s1 = new Scanner(System.in);
System.out.println("Enter Internal Marks:");
for(int i=0;i<5;i++){
m[i] = s1.nextInt();
}
}
public void display(){
student.display();
for(int i=0;i<5;i++){
System.out.println("Marks of sub" + (i+1) + " = " + m[i]);
}
}
}

package SEE;
import java.util.Scanner;
import CIE.Internal;
import CIE.Student;
public class External extends CIE.Student{
public int x[] = new int[5];
public void accept(){
Scanner s2 = new Scanner(System.in);
System.out.println("Enter External Marks:");
for(int i=0;i<5;i++){
x[i] = s2.nextInt();
}
}
public void display(){
super.display();
for(int i=0;i<5;i++){
System.out.println("Marks of sub" + (i+1) + " = " + x[i]);
}
}
}

import java.util.Scanner;
import CIE.Student;
import CIE.Internal;
import SEE.External;
public class Final{
public static void main(String[] args) {
Scanner n = new Scanner(System.in);
System.out.println("Enter n:");
int y = n.nextInt();
CIE.Internal[] c1 = new CIE.Internal[y];
SEE.External[] c2 = new SEE.External[y];
for(int i=0;i<y;i++){
c1[i] = new CIE.Internal();
c2[i] = new SEE.External();
c1[i].accept();
c2[i].accept();
// c1[i].accept();c2[i].accept();
c1[i].display();c2[i].display();
for(int j=0;j<5;j++){
double calc = c1[i].m[j]+((c2[i].x[j])/2);
System.out.println("Final marks of sub["+(i+1)+"]= "+calc);
}
}
}
}