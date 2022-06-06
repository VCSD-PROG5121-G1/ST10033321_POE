/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;




/**
 *
 * @author adamw
 */

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String username,password,name,surname;
      
     Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username= s.nextLine();
        
        System.out.print("Enter password:");
        password= s.nextLine();
        
        System.out.print("Enter name:");
        name= s.nextLine();
        
        System.out.print("Enter surname:");
        surname= s.nextLine();
        
        Loginmanager user = new Loginmanager();
   user.setRegisterLogin(password, username, name, surname);
        if (username.equals(user) && password.equals(password))
        {
            System.out.println("login Successful");
        }
        else
        {
            System.out.println("login not valid");
        }
    }
}
