/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class w05e04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        while (number <0){
            System.out.println("please enter a positive number");
            System.out.print("Enter a positive number: ");
        number = sc.nextInt();
        }
        System.out.println("you entered: " + number);
    } 
}
