import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int noOfTwoThousandNote= sc.nextInt();
        int noOfFiveHundredNote= sc.nextInt();
        int noOfTwoHundredNote= sc.nextInt();
        int noOfOneHundredNote= sc.nextInt();

        int withdrawAmount= sc.nextInt();

        TwoThousandNotes noOfTwoThousandNotes= new TwoThousandNotes(noOfTwoThousandNote);
        TwoHundredNotes noOfTwoHundredNotes= new TwoHundredNotes();

    }
}

interface Atm{
    void withdraw();
}

class ATM implements Atm{

    Notes notes; 
    void withdraw(int withdrawAmount){
        if(notes instanceof TwoHundredNotes)
    }
}

class Notes{

    
}

class TwoThousandNotes extends Notes{
    
    int noOfTwoThousandNotes;

    TwoThousandNotes(int noOfThousand){
        this.noOfTwoThousandNotes= noOfThousand;
    }
     void display(){
         System.out.println(noOfTwoThousandNotes);
     }
}
class FiveHundredNotes extends Notes{
    
    int noOfFiveHundredNotes;

    FiveHundredNotes(int noOfFiveHundred){
        this.noOfFiveHundredNotes= noOfFiveHundred;
    }
}
class TwoHundredNotes extends Notes{
    
    int noOfTwoHundredNotes;

    TwoHundredNotes(int noOfTwoHundred){
        this.noOfTwoHundredNotes= noOfTwoHundred;
    }
}
class OneHundredNotes extends Notes{
    
    int noOfOneHundredNotes;

    OneHundredNotes(int noOfOneHundred){
        this.noOfOneHundredNotes= noOfOneHundred;
    }
}