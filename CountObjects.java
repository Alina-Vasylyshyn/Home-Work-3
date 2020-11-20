package Cursor;


class Class {
    static int number;

    Class(){
        number++;

    }
}

public class CountObjects {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Class();
        }
        System.out.println(Class.number);
    }


}
