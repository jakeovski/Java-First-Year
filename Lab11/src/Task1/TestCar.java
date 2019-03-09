package Task1;


/**
 * Test class for Car and Person classes
 * @author Vladimir Bardadom
 * @version 1.0 09/03/2019
 */

public class TestCar {
    
    public static void main(String[] args) {
        
        //Test of the person class
        Person p1 = new Person("Ilya","Maddyson",31,true);
        
        //Test of the Car class
        Car car1 = new Car(p1,"Lada", 60000,true);
        
        //First test
        System.out.println(car1.toString());
    }
}