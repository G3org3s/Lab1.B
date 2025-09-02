/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_b;

/**
 *
 * @author 6302743
 */
public class GradedActivity {
    private double numericScore;

    public GradedActivity() {
    }
    
    public void setScore(double score) {
        this.numericScore = score;
    }

    public double getScore() {
        return numericScore;
    }

    public char getGrade() {
        char grade;
        
        if (numericScore >= 90) {
            return grade = 'A';
        } else if (numericScore >= 80) {
            return grade = 'B';
        } else if (numericScore >= 70) {
            return grade = 'C';
        } else if (numericScore >= 60) {
            return grade = 'D';
        } else {
            return grade = 'F';
        }
    }
    
    
    
}
