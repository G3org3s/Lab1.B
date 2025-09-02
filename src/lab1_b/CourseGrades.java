/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_b;

/**
 *
 * @author 6302743
 */
public class CourseGrades implements Analyzable {
    public GradedActivity grades[];
    private int NUM_GRADES = 4;  

    public CourseGrades() {
        this.grades = new GradedActivity[4];
    }
    
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }
    
    public void setPassFailExam(PassFailExam exam){
        grades[1] = exam;
    }
    
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalEx) {
        grades[3] = finalEx;
    }
    
    @Override
    public double getAverage() {
        double sum = 0;
        for (GradedActivity eval : this.grades) {
            sum += eval.getScore();
        }
        return sum / grades.length;
    }
    
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() > grades[i - 1].getScore()) {
                highest = grades[i];
            }
        }
        return highest;
    }
    
    
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() < grades[i - 1].getScore()) {
                lowest = grades[i];
            }
        }
        
        return lowest;
    }
    
    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + "  Grade: " + grades[0].getGrade() +
                "\n" + "Pass/Fail Exam Score: " + grades[1].getScore() + "  Grade: " +
                grades[1].getGrade() + "\n" + "Essay Score: " + grades[2].getScore()
                + "  Grade: " + grades[2].getGrade() + "\n" + "Final Exam Score: "
                + grades[3].getScore() + "  Grade: " + grades[3].getGrade();
    }
    
    
    
}
