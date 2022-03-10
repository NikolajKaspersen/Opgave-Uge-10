package Task1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Huyndai","I20",2013,"FourDoors");
        Car car2 = new Car("Ford","Mondeo",2016,"Sedan");
        Driver c = new Driver ("Nikolaj", 24);
        car.setDriver(c.toString());
        car2.setDriver(c.toString());
        System.out.println(car);
        System.out.println(car2);

    }
}
