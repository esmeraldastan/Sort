
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
    double[] list ={ 37, 21, 6, 10, 26, 77, 3, 15, 69, 51, 5};
    int [] orderIndex = new int[list.length];
    
    double [] temp = list.clone();
    
    
    public void myMethod(){
        for (int i = 0; i < temp.length; i++){
            for (int j = 0; j<list.length; j++){
                if (list[j] == temp[i]){
                    orderIndex[i]=j;
            
                 }
                }
        }
    }
    
    
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
        int numlist = 1;
        for( int i = 0; i < sorting.size(); i++){
        System.out.println( numlist + ": " + sorting.get(i));
        numlist++;
      }
      System.out.println();
    }
    //Bubble Method 
    public void bubbleMethod(){
          boolean inorder = false;
         while(!inorder){
             inorder = true;
           for( int i = 0; i < sorting.size()-1; i++){
               if (sorting.get(i) > sorting.get(i+1)){
                inorder = false;
                int temp = sorting.get(i);
                sorting.set(i ,sorting.get(i+1));
                sorting.set(i+1, temp);
               }
           }
            }
        }
  
    public void insertionMethod(){
       int num;
       for (int i = 0 ; i < sorting.size(); i++)
           for(int j = 1 ; j>0; j--){
               if (sorting.get(j) < sorting.get(j-1)){
                   num = sorting.get(1);
                   sorting.set(j, sorting.get(j-1));
                   num = sorting.get(j-1);
               }
           }
        }
        
    
   
    public void selectionMethod (){
        for (int numStart = 0; numStart < sorting.size(); numStart++){
           int leastNum = numStart;
           for (int i = numStart; i < sorting.size(); i++){
             if ( sorting.get(i) <sorting.get(leastNum)){
                    int temp = sorting.get(numStart);
                    sorting.set(numStart, sorting.get(leastNum));
                    sorting.set(leastNum, temp);
                }
            }
           }
    }
}
   
    
        
    
    

    