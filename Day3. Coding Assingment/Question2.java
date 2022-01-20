//import java.nio.file.WatchEvent.Kind;
import java.util.*;
class Question2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int king[]= new int [2];
        king[0]= sc.nextInt();
        king[1]= sc.nextInt();
        int bishop[]= new int [2];
        bishop[0]= sc.nextInt();
        bishop[1]= sc.nextInt();
        int rook[]= new int[2];
        rook[0]= sc.nextInt();
        rook[1]= sc.nextInt();
        int queen[]= new int[2];
        queen[0]= sc.nextInt();
        queen[1]= sc.nextInt();
        int knight[]= new int[2];
        knight[0]= sc.nextInt();
        knight[1]= sc.nextInt();
        if(!positionOfBishop(king , bishop) && !positionOfRook(king, rook) &&
         !positionOfQueen(king, queen) && !positionOfKnight(king, knight))
            System.out.println("Valid");
        else 
            System.out.println("Invalid");

    }
    public static boolean positionOfBishop(int king[],int bishop[]){
        int right_daigonal= bishop[0]+ bishop[1];
        int kings_position= king[0] + king[1];
        if(kings_position != right_daigonal){
            if(king[0]-bishop[0]== king[1]- bishop[1])
             return true;
        }
        return false;
    }
    public static boolean positionOfRook(int king[],int rook[]){
        if(king[0]==rook[0] || king[1]==rook[1])
         return true;
        
        return false;
    }
    public static boolean positionOfQueen(int king[],int queen[]){
        if(positionOfBishop(king,queen) || positionOfRook(king, queen))
         return true;
        
        return false;
    }
    public static boolean positionOfKnight(int king[], int knight[]){
        int k_i=knight[0], k_j=knight[1];
        int positions[][]={{k_i-2,k_j-1},
        {k_i-2,k_j+1},
        {k_i+2,k_j-1},
        {k_i+2,k_j+1},
        {k_i-1,k_j-2},
        {k_i+1,k_j-2},
        {k_i-1,k_j-2},
        {k_i+1,k_j+2}};
        for(int i=0;i<8;i++){
            //System.out.println(k_i+1+" "+k_j+2);
            if(positions[i][0]== king[0] && positions[i][1]== king[1])
             return true;
        }
        return false;
    }
}