/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Random;
public class w06e07 {
    public static void main(String[] args){
        int[] num = new int[20];
        Random rn = new Random();
        for (int i = 0; i<num.length; i++){
            num[i]= rn.nextInt(100);
        }
        for (int i = 0;i<num.length-1;i++){
            for (int j = 0;j<num.length-1-i;j++){
                if (num[j] > num[j+1]){
                    int hold = num[j];
                    num[j]=num[j+1];
                    num[j+1]=hold;
                }
            }
        }
        for (int i = 0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
    
}
