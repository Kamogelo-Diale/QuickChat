/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat;
import java.util.Scanner;
/**
 * //("^+27\\d{9}")
 * @author Student
 */
class Login {
    Scanner input = new Scanner (System.in);
    String username;
    String password;
    String cellphone;
    
    boolean checkUsername (String username){
     if (username.length()== 5 && username.contains("_")){
         System.out.println("Username successfully captured");
     return true;    
     } 
     else{
         System.out.println("Username is not correctly");
         return false;
     }
    }
    boolean checkPassword(String password){
        if (password.length()==8 && password.contains(".[!@#$%^&*].*") ){
         System.out.println("Password captured successfully");
         return true;
        }
        else{
            System.out.println("Password is not correctly formated");
            return false;
        }
    }
    boolean checkCellphone (String cellphone){
        if (cellphone.length()==10 && cellphone.contains("//^+27\\d(9)")){
        System.out.println("Cellphone number successfully added");
        return true;
        }
        else{
            System.out.println("Cellphone number incorrectly or does not contain intentional code");
            return false;
        }
    }
    public String registerUser(){
       System.out.println("\n======REGISTER ======");
       
       System.out.println("Enter Username");
       username = input.nextLine();
       
       System.out.println("Enter Password");
       password=input.nextLine();
       
       System.out.println("Enter Cellphone number");
       cellphone=input.nextLine();
       
       if(checkUsername(username) && checkPassword(password) && checkCellphone(cellphone)){
      System.out.println("Registration successful");   
       }
       else{
           System.out.println("Registration failed");
       }
      return null;     
    }
     void loginUser(){
        boolean success=false;
        System.out.println("\n======REGISTER ======");
       
       System.out.println("Enter Username");
       username = input.nextLine();
       
       System.out.println("Enter Password");
       password=input.nextLine();
       
       System.out.println("Enter Cellphone number");
       cellphone=input.nextLine();
       }
           
}
    

public class QuickChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner enterMenu = new Scanner(System.in);
        
        Login chatapp = new Login();
        int choice;
        
        
        do{
            System.out.println("\n=======MENU=======");
           System.out.println("1.Register");
           System.out.println("2.Login");
           System.out.println("3.Exit");
           choice = enterMenu.nextInt();
           
           switch (choice){
               case 1:
                   Login.registerUser();
                   break;
               case 2:
                   Login.loginUser();
                   break;
               case 3:
                   break;
               default:
                   System.out.println("Invalid choice");
           }  
        }
        while (choice!=3);{
        enterMenu.close();
    }
    }
    
}
