import java.util.*;
class hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        if(a==0){
            System.out.println("Invalid value. The equation is not quadratic.");
        }
        else{
            double d=b*b-4*a*c;
            if(d>0){
                System.out.println("The roots are real and distinct.");
                double r1=(-b+Math.sqrt(d))/2*a;
                double r2=(-b-Math.sqrt(d))/2*a;
                System.out.println("The roots are: "+r1+" and "+r2);
            }
            else if(d<0){
                System.out.println("The roots are imaginary and distinct.");
                double r1=-b/2*a;
                double r2=d/2*a;
                System.out.println("The roots are: "+r1+r2+"i"+" and "+r1+r2+"i");
            }
            else{
                System.out.println("The roots are real and equal.");
                double r1=-b/2*a;
                System.out.println("The roots are: "+r1+" and "+r1);
            }
        }
    }
}