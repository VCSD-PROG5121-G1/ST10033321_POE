/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author adamw
 */
import java.io.FileWriter;
public class Loginmanager {
   String MessageUser,MessagePassword;
    private String Password,Username,Name,Surname;
    boolean checkUserName, checkPassword, logincheck;  
    
     public boolean checkUserName(String xUsername) 
        {
         if (xUsername.length()<=5 && xUsername.contains("_"))
        {
             checkUserName=false;
             return false;
        }
         else
        { 
        checkUserName=true;
        return true;
        }
     }
     public boolean checkPasswordComplexity(String xPassword) {
        if (xPassword.length()>8 && xPassword.matches("^[a-zA-Z]+$") && xPassword != null) {
            checkPassword=false;
            return false;
        }else{
        checkPassword=true;
        return true;
        }
        }
   
     
     String registerUser(){
     
       if (checkUserName!=true) {
           MessageUser ="Username must contain a underscore(_) & need to be five charcters long";
           return MessageUser ;
       }
        
       if (checkPassword!=true) {
           MessagePassword ="password should have at least eight characters which should have at least one capital letter and at least one special character";
           return MessagePassword;
       }
       else{
           return "successful";
       }
    }
         
    public void setRegisterLogin(String xPassword,String xUser,String xName,String xSurname)
        {
        if(checkPassword==true &&checkUserName==true)
        {
        this.Username=xUser;
        this.Password=xPassword;
        this.Name=xName;
        this.Surname=xSurname;
        }
        else
        {
      this.Username="incorrect";
      this.Password="incorrect";
      this.Name="incorrect";
      this.Surname="incorrect";
        }
     }
     
     boolean loginUser(String xPassword,String xUser){
     
       System.err.println(this.Username+"="+xUser+this.Password+"="+xPassword);
     
       if (this.Username.matches(xUser)&&this.Password.matches(xPassword)) 
       {
       logincheck=true;    
        return true; 
       }
        else
        {
        logincheck=false;
        return false;
        } 
     }
        public String returnLoginStatus(){
        
        if (logincheck=true) {
        return "A successful login: welcome " + Name +" "+ Surname;
        }
        else
        {
        return "A unsuccessful login";
        }
     }
        
   }