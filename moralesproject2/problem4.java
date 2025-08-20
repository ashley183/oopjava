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
public class problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        System.out.println("Input Year: ");
        year = s.nextInt();
        
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a leap year. ");
                }else { 
                    System.out.println(year + " is a leap year. ");
                }
            }else {
                System.out.println(year + " is a leap year. ");
            }
        }else { 
            System.out.println(year +" is a leap year. ");
        }
        
    }
    
}
