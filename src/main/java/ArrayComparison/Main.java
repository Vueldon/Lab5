/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayComparison;

import java.util.Scanner;

/**
 *
 * @author vueld
 */
public class Main 
{
    public static void main(String[] args) 
    {
        int[] numberList = {8, 91, 26, 34, 16, 38, 67, 30, 400, 109, 65};
        
        System.out.println("Please enter a number");

        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
                
        for (int i = 0; i < 11; i++)
        {
            if (numberList[i] > n)
            {
                System.out.println(numberList[i]);
            }
        }
    }
}
