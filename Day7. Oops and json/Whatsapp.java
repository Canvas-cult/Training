
import java.util.*;
public class Whatsapp {
    public static void main(String[] args) {
       // Messaging messaging= new Messaging(false, false);
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        long number= sc.nextLong();
        String message="Hello";

        String nameOfSecondPerson= sc.next();
        long contactNumber= sc.nextLong();
        Text textmessage= new Text(message);
        int time=5;
        Status status= new Status(time);
        ChatWindow chatWindow= new ChatWindow(textmessage);

        ArrayList<Contact> contacts= new ArrayList<Contact>();
        contacts.add(new Contact(name, number, status, chatWindow));
        contacts.add(new Contact(nameOfSecondPerson, contactNumber, chatWindow));
        //System.out.println(contacts.display());
        for(Contact contact : contacts)
        contact.display();
        
    }
}

class Application{

}

interface Profile{
     
    void display();
}

// enum Contact{
    
// };

class Contact implements Profile{

    String name;
    Long contactnumber;
    Status status;
    ChatWindow chatWindow;
    Profile profile;

    Contact(String name, Long contactNumber, ChatWindow chatWindow){
        this.name= name;
        this.contactnumber= contactNumber;
        this.chatWindow= chatWindow;
    }

    Contact(String name, Long contactNumber, Status status, ChatWindow chatWindow){
        this.name= name;
        this.contactnumber= contactNumber;
        this.status= status;
        this.chatWindow= chatWindow;
    }

    public void display(){
        System.out.println("Contact's Profile"+"\nName: "+name+"\nContact Number: "+ contactnumber);
        System.out.println(chatWindow.text);
    }

}

class ChatWindow{

    String chatid;
    Messaging messaging;
    Text text;

    ChatWindow(Messaging messaging){
        this.messaging= messaging;
    }
}

class Messaging{

    boolean send;
    boolean seen;

    Messaging( boolean send, boolean seen){
        this.send= send;
        this.seen= seen;
    }

    void getMessage(){

    }
}

class Text extends Messaging{

    String text="";
    boolean send, seen;

    Text(String text ){
        super(false, false);
        this.text= text;
        
    }
}

class Audio extends Messaging{
    
    Audio(){
        super(false, false);
    }
}

class Video extends Messaging{

    Video(){
        super(false, false);
    }
}

class Status{

    int sendTime;

    Status(int sendTime){
        this.sendTime=sendTime;
    }

    void postStatus(){

    }

     void viewStatus(){
        if(sendTime<24)
          active();
     }

     void activeStatus(){
         if(sendTime<24)
           {
               System.out.println("Active");
            return;
           }
     }

     void active(){

     }
}

class TextStatus extends Status{

    String textString;
    int sendTime;

    TextStatus(String textString, int sendTime){
        super(sendTime);
        this.textString= textString;
    }
}

class ImageStatus extends Status{

    String url;
    int sendTime;
    ImageStatus(String url, int sendTime){
        super(sendTime);
        this.url= url;
    }
}