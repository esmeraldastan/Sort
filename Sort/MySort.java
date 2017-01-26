
/**
 * Write a description of class MySort here.
 * 
 * @author (your name) 
 * @version 1.19.17
 */
// at least 12 different numbers
//doubles
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class MySort{
    ArrayList<Integer> sorting = new ArrayList<Integer>();
    public MySort(){
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
    //print preview
    public void printPreview(){
        for( double i = 0; i < sorting.size(); i++){
        System.out.println(sorting);
      }
    }
    
    //Bubble Method 
    public static void bubbleMethod(int[] numberlist){
        int nuM = numberlist.length; 
        int value = 0 ;
        for( int i = 0; i < nuM; i++){
            for( int i2 = i ; i2 < nuM[i - i2]; i2++){
                if (numberlist[ i2 < 1 }
            }
        
        
    }
   }
   
}
    
        
    
    

    