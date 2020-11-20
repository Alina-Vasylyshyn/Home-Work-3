package Cursor;

public class Circle {
    private static double radius = 5.0;

    private static double square(){
        double square =  Math.PI * Math.pow(radius,2);
        return square;

    }

    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        firstCircle.square();
    }



}
