/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart3;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input weight in pounds: ");
        double weightPounds = sc.nextDouble();
        System.out.println(" input height in pounds: ");
        double heightPounds = sc.nextDouble();
        
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightPounds * 0.0254;
        
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println(" Body Mass Index is " + bmi);
        
        sc.close();
        
    }
    
}
