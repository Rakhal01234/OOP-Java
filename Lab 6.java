//in student.java
package CIE;

import java.util.Scanner;

public class Student {

protected String usn = new String(); protected String name = new String(); protected int sem;

public void inputStudentDetails() { Scanner scanner= new Scanner(System.in);
System.out.println("ennter the usn:");
usn=scanner.next();
System.out.println("enter the name ");
name=scanner.nextLine();
System.out.println("Enter the Semester");
sem=scanner.nextInt();
}

public void displayStudentDetails() { System.out.println("Usn"+usn);
System.out.println("Name"+name);
System.out.println("Semester"+sem);
}
}
//in Internals.java
package CIE; 
import java.util.Scanner;

public class Internals extends Student {

protected int marks[] = new int[5];

public void inputCIEmarks()

{

Scanner scanner= new Scanner(System.in);

System.out.println("ennter the cie marks for"+ name+":");
for (int i=0;i<5;i++){
	System.out.println("ENter marks for the subject"+(i+1)+":");
	marks[i]=scanner.nextInt();
	}

}

}
//in Externals.java
package SEE;

import CIE.Internals;

import java.util.Scanner;

public class Externals extends Internals {

protected int marks[];

protected int finalMarks[];

public Externals() {

marks = new int[5]; 

finalMarks = new int[5]; 

}

public void inputSEEmarks() {

Scanner s = new Scanner(System.in);

for(int i=0;i<5;i++) {

System.out.print("Subject "+(i+1)+" marks: ");

marks[i] = s.nextInt(); 
} 
}



public void calculateFinalMarks() {

for(int i=0;i<5;i++)

finalMarks[i] = marks[i]/2 + super.marks[i];

}

public void displayFinalMarks() { displayStudentDetails();

for(int i=0;i<5;i++)

System.out.println("Subject " + (i+1) + ": " + finalMarks[i]);
}
}
// in Main.java
import SEE.Externals;

class Main {

public static void main(String args[])

{

int numOfStudents = 2;

Externals finalMarks[] = new
Externals[numOfStudents];

for(int i=0;i<numOfStudents;i++)

{

finalMarks[i] = new Externals();

finalMarks[i].inputStudentDetails();

System.out.println("Enter CIE marks");

finalMarks[i].inputCIEmarks();

System.out.println("Enter SEE marks");

finalMarks[i].inputSEEmarks();

}



System.out.println("Displaying data:\n");

for(int i=0;i<numOfStudents;i++)

{

finalMarks[i].calculateFinalMarks();

finalMarks[i].displayFinalMarks();

} 

}

} 
