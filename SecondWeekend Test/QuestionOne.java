
import java.util.*;
class QuestionOne{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Employee clerk= new Employee();
        clerk.name= sc.nextLine();

        String itemName= sc.next();
        double itemPrice= sc.nextDouble();
        double discount=sc.nextDouble();
        Item itemOne= new Item(itemName, itemPrice, discount);
        

        DiscountBill vegetableBill= new DiscountBill(clerk, !true);
        vegetableBill.add(itemOne);
        vegetableBill.printReceipt();
        vegetableBill.getDiscountAmount();
    }
}
class VegetableBill{

    Employee clerk;
    Item item;
    ArrayList<Item> itemList= new ArrayList<Item>();

    public VegetableBill(Employee clerk){
        this.clerk= clerk;
    }

    public void add(Item i){
        
        itemList.add(new Item(i.itemName, i.itemPrice, i.discount));
    }
    public double getTotal(){

        double totalSum=0;
        for (Item item : itemList) {
            totalSum+= item.itemPrice;
        }
        return totalSum;
    }
    public void printReceipt(){
        System.out.println("Name:\t"+ clerk.name);
        System.out.println("Items "+"\tCost"+"\tDiscount"+"   Price After Discount");
        for (Item item : itemList) {
            System.out.println(item.itemName+"\t"+item.itemPrice +"\t"+ item.discount);
         }
        System.out.println("\nTotal Cost:\t"+getTotal());
              
    }

}

class Item{
    
    String itemName;
    double itemPrice;
    double discount;

    Item(String itemName, double itemPrice){
        this.itemName= itemName;
        this.itemPrice =itemPrice;

    }

    Item(String itemName, double itemPrice, double discount){
        this.itemName= itemName;
        this.itemPrice =itemPrice;
        this.discount= discount;
        //System.out.println( this. discount);
    }

    public double getPrice(){
         return this.itemPrice;
    }

    public double getDiscount(){
        return this.discount;
    }
}

class DiscountBill extends VegetableBill{

    //Item item;
    boolean prefered;

    public DiscountBill(Employee clerk, boolean prefered){
        super(clerk);
        this.prefered=prefered;
    }

    public int getDiscountCount(){

        int count=0; 
        if(!prefered)
         return count;
        for (Item item : itemList) {
            if(item.discount > 0 )
                count++;
        }
        return count;
    }

    public double getDiscountAmount(){

        double priceAfterDiscount= getTotal();
        double price;
        
        for (Item item : itemList) {
            if(item.discount>0 && prefered)
                priceAfterDiscount-=item.discount;
        }
        System.out.println("Cost after Discount:\t"+ priceAfterDiscount);
        return priceAfterDiscount;
    }

    public double getDiscountPercent(){
        double price= getTotal();
        double priceAfterDiscount= getDiscountAmount();
         return (priceAfterDiscount/price)* 100;
    }

}

class Employee{

    String name;
    boolean prefered;
}