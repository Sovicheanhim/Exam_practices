public class Interface implements Interface1{
    public void display(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        new Interface().display();
    }
}

interface Interface1{
    int a = 10;
    void display();
}
