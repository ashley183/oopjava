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
public class problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Input number: ");
        num = s.nextInt();
        
        if(num % 3 == 0){
            System.out.println(num +" is divisible by 3");
        }else {
            System.out.println(num +" is not divisible by 3");
        }
        
    }
    
    
}
