package Cursor;

public class Car {
    private static int turnover;
    private static double speed;


    public double getSpeed(){
        return speed;
    }
    public void setSpeed(){
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startMoving(true);
        bmw.turnOfEngine(true);
        bmw.moving(true);
        bmw.keepRequiredSpeed(200);
    }

    public void  startMoving (boolean start){
        if(start == true){
           turnover += 1000;
            System.out.println("You can start plus speed");
        } else {
            System.out.println("Try again!");
        }
    }
    public void turnOfEngine (boolean turnOf){
        if(turnOf == true){
            turnover -= 1000;
            System.out.println("Car stop");
        } else {
            System.out.println("Try again!");
        }
    }
    public void moving (boolean move){
        if(move == true){
            speed += 20;
            System.out.println("Car is moving!");
        }
    }
    public void keepRequiredSpeed (int speed){
        this.speed = speed;
        System.out.println("Car keeps the required speed");
    }

}
