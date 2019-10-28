/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author vueld
 */
public class TestScores
{
    public TestScores(double[] scores)
    {
        
    }
    
    public double getAverage(double[] scores) throws Exception
    {
        double average = 0;
        
        for(int i = 0; i<scores.length; i++)
        {
            if(scores[i]<0 || scores[i]>100)
            {
                throw new Exception("All scores must be between 0 and 100, or equal to 0 or 100");
            }
            average += scores[i];
        }
        average /= scores.length;
        
        return average;
    }
}
