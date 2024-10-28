
class Gen<T,B>{
    T ob1;
    B ob2;
    Gen(T o1,B o2){
        ob1=o1;
        ob2=o2;
    }
    T getob1(){
        return ob1;
    }

    B getob2(){
        return ob2;
    }
    void showType(){
        System.out.println("Type of T is: "+ob1.getClass().getName());
        System.out.println("Type of B is: "+ob2.getClass().getName());
    }
}


class TwoParameter{
    public static void main(String[] args) {
        Gen<Integer,Double> iob;
        iob=new Gen<Integer,Double>(88,88.312);
        iob.showType();
        System.out.println("AutoUnBox value of T: "+iob.getob1());
        System.out.println("AutoUnBox value of B: "+iob.getob2());
    }
}