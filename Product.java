/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproject1;
import java.util.*;
/**
 *
 * @author Chelsey
 */
public class Product {
    public static LinkedList<String> IDnumber = new LinkedList<String>();
    public static LinkedList<String> IDnumberUnsealed = new LinkedList<String>();
    public static LinkedList<String> IDnumberSealed = new LinkedList<String>();
    public static LinkedList<String> newIDnumber = new LinkedList<String>();
    public static ArrayList<String> newWeight = new ArrayList<String>();
    public static String weight;
    
    Random rand = new Random();
    int num1;
    int length;
    
    Scanner keyboard = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    
    
    
    public Product(){
    
    length = input.nextInt();
    String[] num1 = new String[length];
    String[] numbers = new String[length];
    
    for(int i = 0; i < length; i++){

    ArrayList<String> items = new ArrayList<String>(6);
    items.add("Phone");
    items.add("Camera");
    items.add("Laptop");
    items.add("Headphones");
    items.add("Speaker");
    items.add("Monitor");
    int index1 = rand.nextInt(items.size());
    String item = items.get(index1);
    
    ArrayList<String> colors  = new ArrayList<String>(6);
    colors.add("Black");
    colors.add("White");
    colors.add("Gray");
    colors.add("Rose Gold");
    colors.add("Gold");
    colors.add("Silver");
    int index2 = rand.nextInt(colors.size());
    String color = colors.get(index2);
    
    ArrayList<String> brands  = new ArrayList<String>(6);
    brands.add("Apple");
    brands.add("Microsoft");
    brands.add("Samsung");
    brands.add("Sony");
    brands.add("LG");
    brands.add("Asus");
    int index3 = rand.nextInt(brands.size());
    String brand = brands.get(index3);
    
    ArrayList<String> years  = new ArrayList<String>(6);
    years.add("2020");
    years.add("2019");
    years.add("2018");
    years.add("2017");
    years.add("2016");
    years.add("2015");
    int index4 = rand.nextInt(years.size());
    String year = years.get(index4);
    
    ArrayList<String> weights  = new ArrayList<String>(6);
    weights.add("1.72 lbs");
    weights.add("2.31 lbs");
    weights.add("4.60 lbs");
    weights.add("3.89 lbs");
    weights.add("5.10 lbs");
    weights.add("7.32 lbs");
    int index5 = rand.nextInt(weights.size());
    weight = weights.get(index5);
    newWeight.add(weights.get(index5));
    
    ArrayList<String> sealed  = new ArrayList<String>(6);
    sealed.add("Unsealed");
    sealed.add("Sealed");
    sealed.add("Unsealed");
    sealed.add("Sealed");
    sealed.add("Unsealed");
    sealed.add("Sealed");
    int index6 = rand.nextInt(sealed.size());
    String seal = sealed.get(index6);
    
    System.out.println("Enter six digit barcode number for item " + (i+1));
    
    boolean keepGoing = true;
    while(keepGoing)
    {
    numbers[i] = keyboard.nextLine();
   
    if(numbers[i].length() !=6){
        System.out.println("WRONG INPUT. Please enter six digit ID number.");
        keepGoing = true;
    }else {
     break;
    }  
        }

    System.out.println("Item: " + item);
    System.out.println("Color: " + color);
    System.out.println("Brand: " + brand);
    System.out.println("Model year: " + year);
    System.out.println("Weight: " + weight);
    System.out.println("Sealed or Unsealed: " + seal);
    
    if(seal == sealed.get(0)){
        String n = numbers[i];
        IDnumberUnsealed.add(n);
    }else if(seal == sealed.get(2)){
        String n = numbers[i];  
        IDnumberUnsealed.add(n);
    }else if(seal == sealed.get(4)){
        String n = numbers[i];
        IDnumberUnsealed.add(n);
    }else if(seal == sealed.get(1)){
        String n = numbers[i];
        IDnumberSealed.add(n);
    }else if(seal == sealed.get(3)){
        String n = numbers[i];
        IDnumberSealed.add(n);
   }else if(seal == sealed.get(5)){
        String n = numbers[i];
        IDnumberSealed.add(n);
  }
      
    IDnumber.add(numbers[i]);
    }
    
    System.out.println("The ID numbers for the items are:");
    bubbleSort(IDnumber);
    System.out.println();
    }
    //bubble sort
    public static void bubbleSort(LinkedList<String> ListID){

      for(int j = 0; j < ListID.size(); j++){
          for(int i = j + 1; i < ListID.size(); i++){
              if((ListID.get(i)).compareToIgnoreCase(ListID.get(j))<0){
          String t = ListID.get(i);
          ListID.set(j,ListID.get(i));
          ListID.set(i,t);
          
      }
    }
        newIDnumber.add(ListID.get(j));  
        
    }
        System.out.println(newIDnumber);
    }
    //Queue
    public static void IDQueue(LinkedList<String> ListIDnumber) {
		Queue<String> queue = new LinkedList<String>();
		int n = ListIDnumber.size();
		System.out.println("User's Items ID numbers listed in system:");
		for(int i = 0; i < n; i++) {
			queue.add(ListIDnumber.get(i));
		}
                for(int i = 0; i < n; i++) {
                        System.out.println(queue.poll());	
		}
                System.out.println("Total number of items:");
                
                System.out.println(ListIDnumber.size());
               try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void newWeights(LinkedList<String> ListWeights){
               ArrayList<String> newWeights  = new ArrayList<String>(6);
        newWeights.add("1.72 lbs");
        newWeights.add("2.31 lbs");
        newWeights.add("4.60 lbs");
        newWeights.add("3.89 lbs");
        newWeights.add("5.10 lbs");
        newWeights.add("7.32 lbs");
       
        Random rand = new Random(); 
        //for(i = Product.IDnumberUnsealed){
        for(int i=0; i< ListWeights.size(); i++){
        String CWeight = newWeight.get(i);
        if(CWeight == newWeights.get(rand.nextInt(newWeights.size()))){
            System.out.println(" " + CWeight + " is equal to " + newWeights.get(rand.nextInt(newWeights.size())));
        }
        else{
            System.out.println(" " + CWeight + " does NOT equal to " + newWeights.get(rand.nextInt(newWeights.size())));
            System.out.println("Items are not equal. Inform manager up front!");
            System.out.println("PROGRAM END!");
            System.exit(1);
        }
  }
    }
  
}
