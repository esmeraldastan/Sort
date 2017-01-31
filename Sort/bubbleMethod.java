
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
       for (int i= 0 ; i<n; i++)
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
     /**
      * while(boolean){
      *     boolean inorder = True; //goes on the outside "False"
      *     
      * for(int =0 ; i < arraylist.size; i ++){
      *     if (arraylist.get(i)>arraylist.get(i+ 1){
      *         inorder = False;
      *         int temp = arraylist.get(i)
      *         arraylist.set( i, arraylist.get(i +1));
      *         arraylist.set(i+1, temp);
      *         }
      */
     public  void bubbleMethod(){
         
         boolean inorder = false;
         while(inorder){
             inorder = true;
            int nuM = sorting.size; 
           for( int i = 0; i < nuM ; i++){
               if (arrayRandom.get(i) > nuM.get(i+1)){
                inorder = false;
                int temp = nuM.get(i);
                nuM.set(i ,arraylist.get(i+1));
                nuM.set(i+1, temp);
                
                
                 
                }
           }
            }
    }
}
    
        
     


    
    