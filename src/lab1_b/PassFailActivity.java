/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_b;

/**
 *
 * @author 6302743
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore; 

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }
    
    public char getGrade() {
        if (getScore() < this.minPassingScore) {
            return 'F';
        } else {
            return 'P';
        }
    }
    
}
