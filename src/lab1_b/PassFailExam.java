/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_b;

import java.util.logging.Logger;

/**
 *
 * @author 6302743
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100 / numQuestions;
        double score = 100.0 - (numMissed * pointsEach);
        setScore(score);
    }
    
    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
