//Encapsulation is defined as the wrapping up of data under a single unit.
//It is the mechanism that binds together code and the data it manipulates.
public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setAge(16);
        obj.setFirstName("Sovichea");
        obj.setLastName("Nhim");
        System.out.println(obj.getFirstName()+" "+ obj.getLastName() + " "+ obj.getAge());
    }
}
class Encapsulate{
    private String firstName;
    private String lastName;
    private int age;
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
}
