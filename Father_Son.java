import java.util.*;

class WrongAge extends Exception {
    public WrongAge(String message){
        super(message);
    }
}

class Father{
    int fatherAge;
    public Father(int age) throws WrongAge {
        if(age<0){
            throw new WrongAge("Age cannot be less than 0.");
        }
        fatherAge = age;
    }
}

class Son extends Father{
    int sonAge;
    public Son(int fatherAge,int age) throws WrongAge {
        super(fatherAge);
        if(age<0){
            throw new WrongAge("Age cannot be less than 0.");
        }
        if(fatherAge<sonAge){
            throw new WrongAge("Son's Age cannot be greater than Father's Age.");
        }
        this.sonAge=sonAge;
    }
}

class Father_Son{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the Fathers age: ");
            int fatherAge=sc.nextInt();

            System.out.println("Enter the Son's age: ");
            int sonAge=sc.nextInt();
            Son son=new Son(fatherAge,sonAge);
            Father father=new Father(fatherAge);
            
            System.out.println("Father's Age: "+fatherAge);
            System.out.println("Son's Age: "+sonAge);
        }
        catch(WrongAge e){
            System.out.println("Exception Caught: "+e);
        }
    }
}