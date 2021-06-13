/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproject1;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Chelsey
 */
public class Search{
     Product[] items = new Product[1];
     Random rand = new Random();
     int length;
     private LinkedList<String> product = new LinkedList<String>();
     String[] array = product.toArray(new String[product.size()]);
     
     int temp = 0;
     
public Search(){

        System.out.println("Barcodes of items that are Unsealed: " + Product.IDnumberUnsealed);
        System.out.println("Barcodes of items that are Sealed: " + Product.IDnumberSealed);
        System.out.println("Barcodes of total items: " + Product.IDnumber);
        System.out.println();
        System.out.println("Add items that are unsealed on the scale.");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        
        Product.newWeights(Product.IDnumberUnsealed);
        System.out.println();
        System.out.println("No items that are unsealed to scale.");
        System.out.println("Proceed to payment.");
        System.exit(1);
        
    }

            }



