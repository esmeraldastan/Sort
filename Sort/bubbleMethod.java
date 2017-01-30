
/**
 * Write a description of class BubbleMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class bubbleMethod{
    //random number picker 
    ArrayList<Integer> sorting = new ArrayList<Integer>();
    public bubbleMethod(){
        sorting.addAll(RandomArray(10000));// this adds 10,000 random
    }
    private static ArrayList<Integer>RandomArray(int n){
        /**
         * This method creates n random numbers between 0 (including) and 10,000
         */
        ArrayList<Integer> arrayRandom = new ArrayList<Integer>();
       for (int i=0; i<n; i++)
        {
            arrayRandom.add((int)(Math.random()*100000));
        }
        return arrayRandom;
     }
     
     public void printPreview(){
        for( int i = 0; i < sorting.size(); i++){
        // number printed form i itself    
        System.out.println(sorting.get(i));
      }
    }
     
     public static void bubbleMethod(int[] arrayRandom){
        int nuM = arrayRandom.length; 
        int value = 0 ;
        for( int i = 0; i < nuM; i++){
                                     //numberlist - i2
            for( int i2 = i ; i2 < (nuM- i2); i2++){
                if (arrayRandom[ i2 - 1 ]> arrayRandom[i2]){
                 value = arrayRandom[i2 - 1];//same as if 
                 arrayRandom[i2 - 1]  = arrayRandom[i2];
                 arrayRandom[i2] = value;
           }
         }
       }
    }
    public  void printBubbleMethod(){
     }
}
}
    
    