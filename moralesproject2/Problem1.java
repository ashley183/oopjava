/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moralesproject2;
import java.util.Scanner;

/**
 *
 * @author User morales
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Input number: ");
        num = s.nextInt();
        
        if(num < 0){
            System.out.println(num +" is negative");
        }else {
            System.out.println(num +" is Positive");
        }
        
        
       
       
        
    }
    
}
