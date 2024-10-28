
// Generics two programs:  One with single parameter and two parameters Also autoboxing and autoinboxing

class Gen<T>{
    T ob;
    Gen(T O){
        ob=O;
    }
    T getob(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is: "+ob.getClass().getName());
    }
}

class Generics{
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<Integer>(88);
        iob.showType();
        System.out.println("AutoUnBox Value: "+iob.getob());
    }
}


