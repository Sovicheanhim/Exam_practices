public class Inheritance {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 45, 65);
        System.out.println(mb.toString());
    }
}
class Bicycle{
    int gear;
    int speed;
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUP(int increment){
        speed += increment;
    }
    public String toString(){
        return "No of gears are " + gear + "\nspeed of bicycle is " + speed;
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public String toString(){
        return super.toString()+"\nsear Height is " + seatHeight;
    }
}