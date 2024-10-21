// Develop a Java program to create an abstract class named Shape that contains two integers and an empty methodnamed printArea( ). Provide three classes named  Rectangle, Triangle and Circle such that each one of the
// classes extends the class Shape. Each one of the classes contain only the method printArea( ) that prints the area of the given shape.

abstract class Shape{
    double a;
    double b;
    Shape(double a,double b){
        this.a=a;
        this.b=b;
    }
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(double a,double b){
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of Rectangle: "+a*b);
    }
}

class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of Triangle: "+0.5*a*b);
    }
}

class Circle extends Shape{
    Circle(double a){
        super(a,0.0);
    }
    void printArea(){
        System.out.println("Area of Circle: "+3.14*a*a);
    }
}

class abstract1{
    public static void main(String[] args){
        Rectangle r1=new Rectangle(5.0,4.0);
        Triangle t1=new Triangle(5.0,4.0);
        Circle c1=new Circle(5.0);

        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}