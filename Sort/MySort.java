
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
       for (int i=0; i<12; i++)// twelve #
        {
            arrayRandom.add((int)(Math.random()*100000));
        }
        return arrayRandom;
     }
    //print preview
    public void printPreview(){
        for( int i = 0; i < sorting.size(); i++){
        System.out.println(sorting.get(i));
        
      }
      System.out.println();
    }
    //Bubble Method 
    public void bubbleMethod(){
          boolean inorder = false;
         while(inorder){
             inorder = true;
           for( int i = 0; i < sorting.size(); i++){
               if (sorting.get(i) > sorting.get(i+1)){
                inorder = false;
                int temp = sorting.get(i);
                sorting.set(i ,sorting.get(i+1));
                sorting.set(i+1, temp);
               }
           }
            }
        }
    /**
     * 
     public void insertionMethod(){
        boolean order = false;
        for (int i = 0 ; i < sorting.length(); i++)
        while (order){
            inorder = true;
            for 
        
        
   
        }
    }
    */
   /
   
    public void selectionMethod (){
     for ( int i = 0; i < sorting.size - 1; i++){
         int index = i;
        for (int a = i + 1; a < sorting.size; a++){
        if ( sorting[a] < sorting[index] ){
            index = a; 
         }
         int leastNumb = sorting.get(i);
         sorting.se
       }
     }
    }
}
   
    
        
    
    

    