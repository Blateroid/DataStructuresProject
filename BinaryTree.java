/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproject1;
import java.util.*;

public class BinaryTree {
    Scanner scan = new Scanner(System.in);
    //String ans;
    int choice;
    String ans;
    
    public BinaryTree(){
        //char ch;
  
boolean menu = true;
 while(menu)
        {
            System.out.println("\nChoose Operation\n");
            System.out.println("1. Insert Product");
            System.out.println("2. Count Products");
            System.out.println("3. Search Product");
            
 choice = scan.nextInt();
 switch (choice){
 
 case 1 :
        boolean keepGoing = true;
            while(keepGoing)
        {
         Product[] items = new Product[1];
         System.out.println("How many items are you entering?");
            for(int i = 0; i < 6; i++){
            
            items[i] = new Product();
        break;
     }
    Scanner answer = new Scanner(System.in);
    System.out.println();
    System.out.println("Do you want to add more items?");
    System.out.println("Y: Input more items");
    System.out.println("N: Back to Menu");
    ans = answer.nextLine();
    if(ans=="Y" || ans=="y"){
        keepGoing = true;
    }else if(ans=="N" || ans=="n"){
        break;
    }
    break;
        }
         break;  
 case 2 :
     Product[] count = new Product[1];
            Product.IDQueue(Product.IDnumber);
         break;
 case 3 :
        Search[] barcode = new Search[1];
         for(int i = 0; i < 6; i++){
            barcode[i] = new Search();
        break;
         }
         break;
 default :
 System.out.println("Wrong Entry \n ");
 break;
    }
        }
   }
   }


          
