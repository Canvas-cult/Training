import java.util.*;
class SecondTry{
    public static void  main(String agrs[]){
        Scanner sc= new Scanner(System.in);

    }
}

enum Person{
    Shiva, Bhavuk, Payal
};

public class Person{

    String name;
    int age;
    Vehicle vehicle;

    Person(Vehichle vehichle){
        this.vehicle= vehichle;
    }

    void display(){
        System.out.println()
    }

}

public class Vehichle{

    String colour;
    Vehicle(String colour){
        this.colour=colour;
    }

    void engine(){
        System.out.println();
    }
}

class Bike extends Vehichle{

    int power;
    int modelNo;
    String color;
    
    Bike(){

    }
}

class Car extends Vehichle{

    int power;
    int modelNo;
    String color;
    
    Car(){
        
    }
}
