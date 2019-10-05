public class Keywords {
    public static void finalKeyword(){
        final StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
    }
    public static void main(String[] args) {
        finalKeyword();
        new Children().print();
    }

}
class SuperKeyword{
    int age = 16;
}
class Children extends SuperKeyword{
    int age = 9;
    public void print(){
        System.out.println("Age = "+age);
        System.out.println("Age = "+super.age);
    }
}
