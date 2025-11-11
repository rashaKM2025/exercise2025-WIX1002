package W05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class w05e02_1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextInt();
        sum += number;
        } while (number != 0);
        System.out.println("The sum is: "+ sum);
    }
}

