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
public class Problem5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Input distance in meters: ");
         double distance = sc.nextDouble();
         System.out.println("Input hour: ");
         int hours = sc.nextInt();
         System.out.println("Input minutes: ");
         int minutes = sc.nextInt();
         System.out.println("Input seconds: ");
         int seconds = sc.nextInt();
         
         int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
         double mps = distance / totalSeconds;
         double kph = (distance / 1000.0) / (totalSeconds / 3600.0);
         double mph = (distance / 1609.0) / (totalSeconds / 3600.0);
         System.out.println("Youre speed in meters/second is " + mps);
         System.out.println("Youre speed in km/h is " + kph);
         System.out.println("Youre speed in miles/h is " + mph);
         
         sc.close();
    }
    
}
