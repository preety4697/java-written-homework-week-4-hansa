package homework_week_9.programme_23_method_overriding;

/**
 *  Creating a child class
 */
public class Bike {
    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();// creating object
        obj.run();// calling method
    }
}
