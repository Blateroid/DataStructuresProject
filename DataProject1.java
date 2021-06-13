/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproject1;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Chelsey
 */
public class DataProject1 extends BinaryTree{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree[] operation = new BinaryTree[1];
        Scanner keyboard = new Scanner(System.in);
        
        //Stack
        Stack login = new Stack();
        String user;
        String intro ="Hello User!";
        String welcome = "Welcome to Micro Center";
        login.push(welcome);
        login.push(intro);
        System.out.println(login.pop());
        System.out.println(login.pop());  
       
        System.out.println("Press any key and ENTER to login");
        user = keyboard.next();
        
        for(int i = 0; i < 6; i++){
            operation[i] = new BinaryTree();
            break;
        }
        
    }
    
}
