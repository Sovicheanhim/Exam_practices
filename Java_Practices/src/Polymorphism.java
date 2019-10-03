import java.lang.reflect.Method;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Overloading.Multiply(5, 3));
        System.out.println(Overloading.Multiply(4.5, 6.7));
        System.out.println(Operator_Overloading.concat("Hello ", "World"));
        System.out.println(Operator_Overloading.sum(2, 4));
        Method_Overriding.print();
        Child.print();

    }
}

class Overloading{
    static int Multiply(int a, int b){
        return a*b;
    }
    static double Multiply(double a, double b){
        return a*b;
    }
}

class Operator_Overloading{
    static int sum(int a, int b){
        return a+b;
    }
    static String concat(String a, String b){
        return a+b;
    }
}

class Method_Overriding{
    static void print(){
        System.out.println("Parent Class");
    }
}
class Child extends Method_Overriding{
    static void print(){
        System.out.println("Child Class");
    }
}