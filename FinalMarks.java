import CIE.*;
import SEE.*;
import java.util.*;

public class FinalMarks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n=sc.nextInt();

        //Declaring a  array of objects
        Student[] students=new Student[n];
        Internal[] internals=new Internal[n];
        External[] externals=new External[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the name of student: ");
            String name=sc.next();

            System.out.println("Enter the USN: ");
            String usn=sc.next();

            System.out.println("Enter the semester: ");
            int sem=sc.nextInt();

            //Reading marks for internals
            System.out.println("Enter the marks of 5 subjects in internals : ");
            int[] internalMarks=new int[5];
            for(int j=0;j<5;j++){
                internalMarks[j]=sc.nextInt();
            }

            //Similarly Reading fro externals
            System.out.println("Enter the marks of 5 subjects in externals : ");
            int[] externalMarks=new int[5];
            for(int j=0;j<5;j++){
                externalMarks[j]=sc.nextInt();
            }

            students[i]=new Student(name,usn,sem);
            internals[i]=new Internal(internalMarks);
            externals[i]=new External(name,usn,sem,externalMarks);
        }

        //calculating final marks and printing
        System.out.println("Final_Details: ");
        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Name: "+students[i].name);
            System.out.println("USN: "+students[i].USN);
            System.out.println("Semester: "+students[i].sem);

            //final marks
            System.out.println("Final_Marks: ");
            for(int j=0;j<5;j++){
                int finalMarks=internals[i].internalMarks[j]+(externals[i].externalMarks[j]/2);
                System.out.println("Marks of subject "+(j+1)+" : "+finalMarks);
            }

            System.out.println();
        }
    }
}
