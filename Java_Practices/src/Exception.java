public class Exception extends Throwable {
    public static void arrayException(){
        int a[] = new int[2];
        try{
            System.out.println("Access element three : " + a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
    public static void newException(){
        try {
            throw new NewException("Hello World");
        }catch (NewException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        newException();
        arrayException();
    }
}
class NewException extends Throwable{
    String str;
    NewException(String str2){
        this.str = str2;
    }
//    toString is a built-in method to return the value of the Exception
    public String toString(){
        return "Output String = " + str;
    }
}
