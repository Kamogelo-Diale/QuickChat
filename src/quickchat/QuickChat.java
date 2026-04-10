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
    String Username;
    String Password;
    String Cellphone;
    
    boolean checkUsername (String Username){
     if (Username.length()== 5 && Username.contains("_")){
         System.out.println("Username successfully captured");
     return true;
         
     } 
     else{
         System.out.println("Username is not correctly");
         return false;
     }
    }
    boolean checkPassword(String Password){
        if (Password.length()==8 && Password.contains(".[!@#$%^&*].*") ){
         System.out.println("Password captured successfully");
         return true;
        }
        else{
            System.out.println("Password is not correctly formated");
            return false;
        }
    }
    boolean checkCellphone (String Cellphone){
        if (Cellphone.length()==10 && Cellphone.contains("//^+27\\d(9)")){
        System.out.println("Cellphone number successfully added");
        return true;
        }
        else{
            System.out.println("Cellphone number incorrectly or does not contain intentional code");
            return false;
        }
    }
}

public class QuickChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
