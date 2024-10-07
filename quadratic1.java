
import java.util.*;
class quadratic{
    public static void main(String[] args) {
        System.out.println("Enter the value of a,b,c: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==0){
            System.out.println("Invalid Input.");
        }
        else{
            double d=b*b-4*a*c;
            if(d>0){
                System.out.println("The roots are real and distinct.");
                double r1=(-b+Math.sqrt(d))/2*a;
                double r2=(-b-Math.sqrt(d))/2*a;
                System.out.println("Roots are: "+r1+" and "+r2);
            }
            else if(d<0){
                System.out.println("The roots are imaginary and distinct.");
                double r1=-b/2*a;
                double r2=(Math.sqrt(d))/2*a;
                System.out.println("Roots are: "+r1+"+"+r2+"i and "+r1+"-"+r2+"i");
            }
            else{
                System.out.println("The roots are real and equal.");
                double r1=-b/2*a;
                System.out.println("Roots are: "+r1+" and "+r1);
            }

        }

    }
}