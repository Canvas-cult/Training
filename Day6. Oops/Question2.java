
import java.util.*;
public class Question2 {
    public static void main(String agrs[])
    {
        Scanner sc =new Scanner(System.in);
        float current =sc.nextFloat();
        float voltage= sc.nextFloat();
        String solar="not Solar";
        String panel="don't have Solar panel";
        String battery="don't have battery";

        PCU inveterPCU= new PCU(current , voltage );
        double c=inveterPCU.Power(current , voltage);
        sc.close();
        if(inveterPCU.isSolar){
         solar="Solar";
         panel="have Solar panel";}
        System.out.println("Power rate="+c+" \n"+inveterPCU.name+" is "+solar+"Inveter and "+ panel);

        GTI inveterGTI= new GTI(current, voltage);
        if(inveterGTI.isSolar){
            solar="Solar";
            panel="have Solar panel";
            
        }
        if(inveterGTI.haveBatteries)
          battery="have battery";
           System.out.println("\nPower rate ="+c+" \n"+inveterGTI.name+" is "+solar+"Inveter and "+ panel);
           System.out.println(battery);

        
        Zelio zelio= new Zelio(current, voltage);
           if(zelio.isSolar){
               solar="Solar";
               panel="have Solar panel";}
               else {
                   solar=" not solar inverter";
                }
              System.out.println("\nPower rate ="+c+" \n"+zelio.name+" is "+solar);
              if(zelio.haveBatteries)
          battery="have battery";
          else 
          battery="don't have battery";
           System.out.println(battery);

           iCruze inverteriCruze= new iCruze(current, voltage);
           if(inverteriCruze.isSolar){
               solar="Solar";
               panel="have Solar panel";}
               else {
                   solar=" not solar inverter";
                }
              System.out.println("\nPower rate ="+c+" \n"+inverteriCruze.name+" is "+solar);
              if(inverteriCruze.haveBatteries)
          battery="have battery";
          else 
          battery="don't have battery";
           System.out.println(battery);

    }
}

//parent class
class Inveter{              


    // properties
    protected boolean isSolar;
    protected boolean haveGrid;         
  // protected boolean hasGrid;
   protected boolean haveBatteries;
   protected boolean havePanel;
   protected float current;
   protected float voltage;
   
    //constructor
   Inveter (boolean isSolar,boolean havePanel, boolean haveGrid,boolean haveBatteries,float voltage,float current){
        this.isSolar=isSolar;
        this.havePanel=havePanel;
        this.haveBatteries=haveBatteries;
        this.haveGrid=haveGrid;
        this.current=current;
        this.voltage=voltage;

    }
   
     //behaviours
   double Power(double Current, double Voltage){
        return Current*Voltage;
    }

    boolean willStoreEnergy(){
        return haveBatteries;
    }

    boolean canSellEnergy(){
        return haveGrid;
    }
    
}

//children class
class PCU extends Inveter {
       String name="PCU";
       

       PCU ( float current, float voltage){
           super(true, true, false, true,current,voltage);
       }  
}

class GTI extends Inveter {
    String name="GTI";
   
    GTI (float current, float voltage){
        super(true, true, true, false,current,voltage);
    }
}

class Zelio extends Inveter {
    String name="Zelio";
    
    Zelio ( float current, float voltage){
        super(false, false, false, true ,current,voltage);
    }

}
class Regalia extends Inveter {
    String name="Regalia";
    
    Regalia (boolean haveBatteries, float current, float voltage){
        super(true, true, false, haveBatteries,current,voltage);
    }

}
class iCruze extends Inveter {
    String name="iCruze";
    
    iCruze ( float current, float voltage){
        super(false, false, false, true,current,voltage);
    }

}
