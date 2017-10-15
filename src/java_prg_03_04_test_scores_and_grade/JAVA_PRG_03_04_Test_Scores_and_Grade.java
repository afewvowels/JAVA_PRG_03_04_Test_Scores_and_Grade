/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_04_test_scores_and_grade;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that has variables to hold three test scores. The program
 * should ask the user to enter three test scores and then assign the values
 * entered to the variables. The program should display the average of the
 * test scores and the letter grade that is assigned for the test score average.
 * Use the grading scheme in the following table:
 * 
 *      Test Score Average          Letter Grade
 *      90-100                      A
 *      80-89                       B
 *      70-79                       C
 *      60-69                       D
 *      Below 60                    F
 */
public class JAVA_PRG_03_04_Test_Scores_and_Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare float variables to hold test scores and average
        float fltTestScore01;
        float fltTestScore02;
        float fltTestScore03;
        float fltTestScoresAverage;
        
        // Define number of tests variable for use in calculating average
        final int INT_NUMBER_OF_TESTS = 3;
        
        // Declare string variables to get user inputs on test scores
        String strTestScore01;
        String strTestScore02;
        String strTestScore03;
        String strOutputString;
        
        // Get test scores from user inputs
        strTestScore01 = JOptionPane.showInputDialog("Please enter your " +
                "first test score.");
        strTestScore02 = JOptionPane.showInputDialog("Please enter your " +
                "second test score.");
        strTestScore03 = JOptionPane.showInputDialog("Please enter your " +
                "third test score.");
        
        // Convert to floats
        fltTestScore01 = Float.parseFloat(strTestScore01);
        fltTestScore02 = Float.parseFloat(strTestScore02);
        fltTestScore03 = Float.parseFloat(strTestScore03);
        
        // Calculate average test score
        fltTestScoresAverage = (fltTestScore01 + fltTestScore02 +
                fltTestScore03) / INT_NUMBER_OF_TESTS;
        
        // Used to determine grade by comparing test average to 
        // grade ranges provided in prompt plus catch if test
        // average is greater than 100 or less than 0
        if(fltTestScoresAverage >= 90 && fltTestScoresAverage <= 100)
        {
            strOutputString = String.format("The average test score was %.1f" +
                    ".\nThat is an A.", fltTestScoresAverage);
            JOptionPane.showMessageDialog(null, strOutputString);
        }
        else if(fltTestScoresAverage >= 80 && fltTestScoresAverage < 90)
        {
            strOutputString = String.format("The average test score was %.1f" +
                    ".\nThat is a B.", fltTestScoresAverage);
            JOptionPane.showMessageDialog(null, strOutputString);
        }
        else if(fltTestScoresAverage >= 70 && fltTestScoresAverage < 80)
        {
            strOutputString = String.format("The average test score was %.1f" +
                    ".\nThat is a B.", fltTestScoresAverage);
            JOptionPane.showMessageDialog(null, strOutputString);
        }
        else if(fltTestScoresAverage >= 60 && fltTestScoresAverage < 70)
        {
            strOutputString = String.format("The average test score was %.1f" +
                    ".\nThat is a B.", fltTestScoresAverage);
            JOptionPane.showMessageDialog(null, strOutputString);
        }
        else if(fltTestScoresAverage >= 0 && fltTestScoresAverage < 60)
        {
            strOutputString = String.format("The average test score was %.1f" +
                    ".\nThat is a B.", fltTestScoresAverage);
            JOptionPane.showMessageDialog(null, strOutputString);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "There was an error while\n" +
                    "calculating your test scores.");
        }
        
        // Exit
        System.exit(0);
    }
    
}
