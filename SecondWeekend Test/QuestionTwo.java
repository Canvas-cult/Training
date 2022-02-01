/**************
 * We need to find manufacturing cost of a box.

There are  5 type of Box.

1. Universal
2. AllFlapMeeting
3. HoneyComb
4. ReverseTuckIn
5. TopOpening SnapLock

Each Box has some basic properties :  length,height,width,area, flute;

A box can either use pins or pasting() to join.
A box can either single part or double part.

there are 7 types of flute : A,B,C,E,F,G and B(B is mostly used).
a flute has gsm and extra gsm;

you need to calcuate cost of a box  : area * totalGSM * ExtraGSM * stitching cost (if double part cost is multiplied by 3)
where as Area : length * width * hight

and total GSM : extraGSM + GSM * 100;

and Extra GSM For Flute :
A = 10,B = 30,C = 20,E = 40,F =50,G = 20

and stitching cost :

1.if box has a pin then  :  10rs per pin
2.if box has a pasting then cost is : 

    1. Universal : 20
    2. AllFlapMeeting : 30
    3. HoneyComb : 40
    4. ReverseTuckIn : 40
    5. TopOpening SnapLock = 50
 ************************/

import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double length= sc.nextDouble();
        double height= sc.nextDouble();
        double width= sc.nextDouble();
        double gsm = sc.nextDouble();
        Flute flute= new Flute(gsm, 10);
        Box box= new UniversalBox(length, height, width, flute);
        System.out.println(box.costOfBox());
    }
}

class Box{
    double length;
    double height;
    double width;;
    double area;
    Flute flute;
     Box(double length,double height, double width,  Flute flute){
        this.length= length;
        this.height =height;
        this.width= width;
        this.flute= flute;
     }

     public double area(){
         return length*width* height ;
     }
     public double costOfBox(){
         double area= area();
         Stitching stitchingCost;
         if(stitchingCost instanceof Pin)
             return area * flute.calculateGsm() * flute.extraGsm * stitchingCost.pinCost;
         
         return area* flute.calculateGsm() * flute.extraGsm * Pasting;
     }
}

class UniversalBox extends Box{

    public UniversalBox(double length, double height, double width,  Flute flute) {
        super(length, height, width, flute);
    }

}

class AllFlapMeetingBox extends Box{
    
    public AllFlapMeetingBox(double length, double height, double width, Flute flute) {
        super(length, height, width, flute);
    }
}

class HoneyCombBox extends Box{
    
    public HoneyCombBox(double length, double height, double width, Flute flute) {
        super(length, height, width, flute);
    }
}

class ReverseTuckBox extends Box{
 
    public ReverseTuckBox(double length, double height, double width, Flute flute) {
        super(length, height, width, flute);
    }
}

class TopOpeningBox extends Box{

    public TopOpeningBox(double length, double height, double width, Flute flute) {
        super(length, height, width, flute);
    }  
}

class Flute{
     double gsm;
     double extraGsm;
     
     Flute(double gsm , double extraGsm){
         this.gsm= gsm;
         this.extraGsm= extraGsm;
     }

     public double calculateGsm(){
         return gsm*100 + extraGsm ;
     }
}

class A extends Flute{

    double extraGsm= 10;
    A(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class B extends Flute{

    B(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class C extends Flute{

    C(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class D extends Flute{

    D(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class E extends Flute{

    E(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class F extends Flute{

    F(double gsm, double extraGsm) {
        super(gsm, extraGsm);
    }

}

class Stitching{

    public double pinCost;

}

class Pin extends Stitching{

    final double pinCost=10;

    public double cost(){
        return pinCost;
    }
}

class Pasting extends Stitching{

    final double PASTING_COST_UNIVERSAL = 20;
    final double PASTING_COST_ALL_FLAP_MEETING = 30;
    final double PASTING_COST_HONEY_COMB = 40;
    final double PASTING_COST_REVERSE_TUCKIN = 40;
    final double PASTING_COST_TOP_OPENING_SNAP_LOCKING = 50;

}