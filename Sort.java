import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Sort{
   
   private static int i;
   private static int temp;
   
   public static void bubbleSort(int[] array) throws InterruptedException{ //throws allows the use of delaying painting 
      for(int i = array.length - 1; i > 0; i--){   //attempts to get largest value to the end of the array
         for(int j = 0; j < i; j++){   //iterates less amount of times as the array's values are moved along
            if(array[j] > array[j+1]){ //if left element is greater than the right, a swap is done
               temp = array[j]; 
               array[j] = array[j+1]; 
               array[j+1] = temp; 
               showValues();
            }
         }
      }
   }
   
   public static void selectionSort(int[] arr, int speed) throws InterruptedException
   { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; 
                    }
             }
            // Swap the found minimum element with the first 
            // element 
            temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
            if(speed == 1){
               showValues();  //normal speed 
            }
            else{
               showValuesSlow(); //slows the algorithm down to show the functionality
            }
        } 
    }
   
   public static void gnomeSort(int[] array) throws InterruptedException{
      /**
      *  If array[i] is greater/equal to array[i-1], the algorithm moves on
      *  If array[i] is less than array[i-1], they are swapped and the algorith goes back to the previous array index and compares again
      *
      **/
      int i = 0;
      int n = array.length;
      
      while(i < n){
         if(i == 0){ //so that sort begins by checking second element to first
            i++;
         }
         if(array[i] >= array[i-1]){   //if swapping is not needed, then moves on to the next element
            i++;
         }
         else{
            temp = array[i];        //stores value temporarily for swapping
            array[i] = array[i-1];  //assigns larger value to the right index position
            array[i-1] = temp;      //assigns smaller value to the left index position
            i--;  //backtracks to see if the swapped value is in the correct position
         }
         showValues();
      }
   }
   
   public static void showValues() throws InterruptedException{  
         SortingApp.frame.repaint();   //repaint   
         Thread.sleep(1);  //delays function for a bit
      }
   public static void showValuesSlow() throws InterruptedException{  
         SortingApp.frame.repaint();   //repaint   
         Thread.sleep(100);  //delays function for a bit
      }
}