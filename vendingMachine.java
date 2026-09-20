import java.util.*;

public class vendingMachine{
    public static void main(String[] args){
        HashMap<Integer , Integer> Balance = new HashMap<>();

        Balance.put(500,1);
        Balance.put(200,0);
        Balance.put(100,1);
        Balance.put(50,1);
        Balance.put(20,1);
        Balance.put(10,25);
        Balance.put(5,3);
        Balance.put(2,0);
        Balance.put(1,500);

        int sum = 500;
        int sum1=0;
        int input = 112;
        int amt = 388;
        int remaining = amt;

        int[] notes = {500,200,100,50,20,10,5,2,1};

        for(int note : notes){
            int current=0;
            while(remaining>= note && Balance.get(note)>0){
                remaining -= note;
                Balance.put(note, Balance.get(note)-1);
                current++;
            }
            System.out.println("Returned "+note+" rupees "+current+" notes");
        }

        if(remaining==0){
            System.out.println("Successfully returned "+amt+" rupees");
        }
        else{
            System.out.println("Failed to return "+amt+" rupees");
        }
    }
}