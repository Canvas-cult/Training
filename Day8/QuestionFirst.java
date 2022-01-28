
import java.util.*;
public class QuestionFirst {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int noOfCity= sc.nextInt();
      String nameOfPerson=sc.nextLine();
      int age= sc.nextInt();
      String addComment= sc.nextLine();

      Brick brick= new Brick();

      Person person= new Person(nameOfPerson, age, brick, addComment);
      person.displayPersonInfo();
      person.write();

      int noOfBricks= sc.nextInt();
      String nameOfCity= sc.next();
      double area= sc.nextDouble();
      
      
      Wall wall= new Wall(noOfBricks);
      int noOfWalls=wall.noOfWalls();
 
      ArrayList<City> cityList= new ArrayList<City>();
      cityList.add(new City(nameOfCity, area, noOfWalls));

      System.out.println(noOfWalls);
    }
}

class Brick{
    boolean hasComment=false;

    boolean hasComment(){
        return false;
    }
}

class Wall{

    int noOfBricks;
    Brick bricks;

    Wall(int noOfBricks){
        this.noOfBricks=noOfBricks;
    }

    public int noOfWalls(){

        if(noOfBricks<=90)
            return 1;
        if(noOfBricks%90 != 0)
            return noOfBricks/90+1;
        return noOfBricks/90;
    }
}

class City{

    
    String nameOfCity;
    double area;
    int noOfWalls;

    City(String nameOfCity, double area, int noOfWalls){
        
        this.nameOfCity= nameOfCity;
        this.area= area;
        this.noOfWalls= noOfWalls;
    }

    void displayInformationOfCity(){
        System.out.println("Name Of City: "+nameOfCity+"\nNo of Walls in city: "+noOfWalls);
    }
}

class Person{

    String nameOfPerson;
    int age;
    Brick brick;
    String addComment;

    Person(String nameOfPerson, int age, Brick brick, String addComment){
        this.nameOfPerson= nameOfPerson;
        this.age= age;
        this.brick= brick;
        this.addComment= addComment;
    }

    void write(){
        System.out.println(addComment);
        if(!brick.hasComment)
        {
             System.out.println(addComment);
             brick.hasComment=true;
             return;
        }
        System.out.println("Comment not added "+brick.hasComment);
    }

    void read(){
        if(brick.hasComment())
        {
            System.out.println("Can read");
        }

    }

    void displayPersonInfo(){
        System.out.println("Name: "+nameOfPerson+"\nAge: "+age);
    }
}
