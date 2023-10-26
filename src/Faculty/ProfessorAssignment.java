/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class ProfessorAssignment {
    double tracerating;
    CourseOffer courseoffer;
    Professor professor;
    public ProfessorAssignment(Professor fp, CourseOffer co){
        courseoffer = co;
        professor = fp;
    }

       public double getRating(){
        
        return tracerating;
    }
       public void seProfRating(double r){
           
           tracerating = r;
       }
    public Professor getFacultyProfile(){
        return professor;
    }
    
}
