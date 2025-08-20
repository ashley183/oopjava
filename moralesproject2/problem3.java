/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moralesproject2;
import java.util.Scanner;

/**
 *
 * @author User morales
 */
public class problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Input 1st number: ");
        num1 = s.nextInt();
        System.out.println("Input 2nd number: ");
        num2 = s.nextInt();
        System.out.println("Input 3rd number: ");
        num3 = s.nextInt();
        
        if(num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("The greatest: " + num2);
        }else {
            System.out.println("The greatest: " + num3);
            
        } 
        
        
    }
    
}
