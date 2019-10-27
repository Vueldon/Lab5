/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author vueld
 */
public class Main 
{
    public static void main(String[] args) 
    {
        int[] numberList = {8, 91, 26, 34, 16, 38, 67};
        
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        
        for (int i = 1; i < 6; i++)
        {
            if (numberList[i] < n)
            {
                System.out.println(numberList[i]);
            }
        }
    }
}
