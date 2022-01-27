/***********shiva set a blue bike ***************/
import java.util.*;
public class Demo {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // String nameOfPerson= sc.nextLine();
        // int age=sc.nextInt();
        // int no_of_vehicles=sc.nextInt();
        // String arr[]=new String[no_of_vehicles];
        // for(int index=0; index<no_of_vehicles; index++){
        //     arr[index]= sc.next();
        // }
       // System.out.println(arr[0]);

        Person person1= new Person("shiva",20);
        //person1.name;
        System.out.println(person1.name+" has");
        person1.setVehicle("bike");
        

        Person person2= new Person("Bhavuk", 24);
        System.out.println(person2.name+" has");
        person2.setVehicle("bmw");

    }
}

class Person{ 

    protected String name;
    protected int age;

    //constructor
    Person (String name, int age){
        this.name=name;
        this.age=age;
        //System.out.println(this.name+" Age="+this.age);
    }

    public void setVehicle(String vehicle){

        System.out.println(vehicle);

        if(vehicle=="bike"){ 
        Bike bike= new Bike("Apache",200);
        bike.setColour("blue ");
        System.out.println(bike.colour+""+bike.type);
        }

        else{ 
        Car car= new Car("BMW");
        car.setColour("white");
        System.out.println(car.colour+" "+car.type);
        }
    }
}

class Vehicle{

    protected String colour;

    public void setColour(String colour){
        this.colour=colour;
    }

}

class Bike extends Vehicle{

    protected double speed;
    protected String type;

    Bike(String type, double speed){
        this.type=type;
        this.speed=speed;
        //System.out.println(this.speed);
    }
}

class Car extends Vehicle{

    protected String type;
    

    Car(String type){
        this.type=type;
        // System.out.println(this.type);
    }
}