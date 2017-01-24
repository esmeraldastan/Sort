
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
    ArrayList<Double> sorting = new ArrayList<Double>();
    public MySort(){
        sorting.addAll(RandomArray(10000));// this adds 10,000 random
    }
    
    private static ArrayList<Double>RandomArray(int n){
        /**
         * This method creates n random numbers between 0 (including) and 10,000
         */
       for (int i=0; i<n; i++)
        {
            arrayRandom.add(Math.random()*100);
        }
        return arrayRandom;
     }
    //print preview
    public void printPreview(){
        for( double i = 0; i < sorting.size(); i++){
        System.out.println(sorting);
      }
    }
}
    
        
    
    

    