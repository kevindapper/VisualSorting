import java.util.Random;
import java.util.Scanner;

public class Setup{
   //TODO: fix this so that sorting is done via menu. I haven't touched this... lol 11/22/19
   public static Scanner input = new Scanner(System.in); //FIX
   public static int userChoice; //reads in user input
   
   public static int[] list;
   public static int i;
   public static int size;
   public static Random rand = new Random();
   
  public static void start() throws InterruptedException{     //starts program
      do{
         sizePrompt();
         sortPrompt();
         exitPrompt();        
      }while(userChoice != 0);
   }
   
   private static void sizePrompt() throws InterruptedException{                  //used to decide array length
      System.out.println("Choose an array length:");
      System.out.println("1 .. 100");
		System.out.println("2 .. 300");
		System.out.println("3 .. 600");
		System.out.print("Your choice: ");
      
      userChoice = input.nextInt();
      
      switch(userChoice){
            case 1:                    //creates desired array length
               size = 100;
               Setup.createArray(size, SortingApp.HEIGHT);
               Sort.showValues();
               break;
            case 2:                    //creates desired array length
               size = 300;
               Setup.createArray(size, SortingApp.HEIGHT);
               Sort.showValues();
               break;
            case 3:                    //creates desired array length
               size = SortingApp.WIDTH - 12;
               Setup.createArray(size, SortingApp.HEIGHT);
               Sort.showValues();
               break;
            default:
               System.out.println("Invalid input");   //restarts program if invalid choice is made
               sizePrompt();
               break;
         }
         SortingApp.frame.setVisible(true);  //displays frame
   }
   
   private static void sortPrompt() throws InterruptedException{                  //used to decide sorting algorithm
      System.out.println("Choose a sorting method:");
      System.out.println("1 .. Gnome sort");
		System.out.println("2 .. Bubble sort");
		System.out.println("3 .. Selection sort (normal speed)");
      System.out.println("4 .. Selection sort (slow)");
		System.out.print("Your choice: ");
      
      userChoice = input.nextInt();
      
      switch(userChoice){
               case 1:                                //runs desired sorting algorithm
                  Sort.gnomeSort(list);
                  break;
               case 2:                                //runs desired sorting algorithm
                  Sort.bubbleSort(list);
                  break;
               case 3:                                //runs desired sorting algorithm
                  Sort.selectionSort(list, 1);
                  break;
               case 4:
                  int time = 1000;                    //runs desired sorting algorithm
                  Sort.selectionSort(list, 0);
                  break;
               default:                               //goes to next prompt if any other choice is given
                  System.out.println("Invalid input");
                  sortPrompt();
                  break;
            }
   }
   
   private static void exitPrompt() throws InterruptedException{
      System.out.println("1 .. run again");
      System.out.println("0 .. exit");
      System.out.print("Your choice: ");
      userChoice = input.nextInt();
      switch(userChoice){
               case 0:                                //runs desired sorting algorithm
                  System.out.print("Good-bye");
                  System.exit(0); //closes code
                  break;
               case 1:                                //runs desired sorting algorithm
                  start();
                  break;
               default:                               //goes to next prompt if any other choice is given
                  System.out.println("Invalid input");
                  exitPrompt();
                  break;
      }
   }
   
   public static void createArray(int size, int height){
      list = new int[size];
      for(i = 0; i < list.length; i++){   //adds desired number of elements to list
         list[i] = rand.nextInt(height -100); //randomly assigns a value between 1 and 100
      } 
   }
}