/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class w05e02e {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (0 to stop): ");
        int number = sc.nextInt();
        do {
        System.out.println("Enter a number (0 to stop): ");
         number = sc.nextInt();
        } while (number != 0);
    }
}
