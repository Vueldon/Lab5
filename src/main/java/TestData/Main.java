/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestData;

/**
 *
 * @author vueld
 */
public class Main
{
    public static void main(String[] args)
    {
        int[] testList = {5, 600, 72, 36, 7989, 12, 120, 594};
        
        int total = getTotal(testList);
        System.out.println("Total: " + total);
        
        int average = getAverage(testList);
        System.out.println("Average: " + average);
        
        int highest = getHighest(testList);
        System.out.println("Highest: " + highest);
        
        int lowest = getLowest(testList);
        System.out.println("Lowest: " + lowest);
    }
    
    public static int getTotal(int[] testList)
        {
            int total = 0;
            for (int i = 0; i < 8; i++)
            {
                total += testList[i];
            }
            return total;
        }
    
    public static int getAverage(int[] testList)
        {
            int average = 0;
            for (int i = 0; i < 8; i++)
            {
                average += testList[i];
            }
            average /= 8;
            
            return average;
        }
    
    public static int getHighest(int[] testList)
        {
            int highest = testList[0];
            for (int i = 0; i < 7; i++)
            {
                if (testList[i] < highest)
                {
                    highest = testList[i];
                }
            }
            return highest;
        }
    
    public static int getLowest(int[] testList)
        {
            int lowest = testList[0];
            for (int i = 0; i < 7; i++)
            {
                if (testList[i] > lowest)
                {
                    lowest = testList[i];
                }
            }
            return lowest;
        }
}
