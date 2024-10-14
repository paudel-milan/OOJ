import java.util.Scanner;
class Stud_details{
int marks[]=new int[3];
int credits[]=new int[3];
String usn,name;
Scanner sc=new Scanner(System.in);

void getDetails(){
System.out.println("Enter the USN:")
usn=sc.next();
System.out.println("Enter the Name:");
name=sc.next();
SYstem.out.println("Enter the credits and marks of 3 subjects: ");
for(int i=0;i<3;i++){
credits[i]=sc.nextInt();
marks[i]=sc.nextInt();
}
}

void displayDetails{
System.out.println("Name: "+name+" USN: "+usn);
System.out.println("The marks and credits of 3 subjects: ");
for(int i=0;i<3;i++){
System.out.println(marks[i]+":"+credits[i];
System.out.println("SGPA: "+calculateSGPA());
}
}
public double calculateSGPA() {
double totalCredits = 0;
double totalPoints = 0;

for (int i = 0; i < 3; i++) {
double points = 0;
if (marks[i] >= 90) points = 10;
else if (marks[i] >= 80) points = 9;
else if (marks[i] >= 70) points = 8;
else if (marks[i] >= 60) points = 7;
else if (marks[i] >= 50) points = 6;
else if (marks[i] >= 40) points = 5;
totalCredits += credits[i];
totalPoints += points * credits[i];
}

return totalPoints/totalCredits;
}
}

class Student{
public static void main(String[] args){
Stud_details s1=new Stud_details[3];
s1.getDetails();
s1.displayDetails();

}  

}
