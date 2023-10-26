package Faculty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import People.Person;
import info5100.university.example.CourseSchedule.CourseOffer;
import People.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Professor {

    Person person;
    String officeLocation;
    ArrayList <ProfessorAssignment> professorAssignments; 
    double rating;
    ArrayList<CourseOffer> teachingHistory;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public Professor(Person p) {

        person = p;
        professorAssignments = new ArrayList();
        teachingHistory = new ArrayList<CourseOffer>();
    }
    public  double getProfAverageOverallRating(){
        
        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
        for(ProfessorAssignment fa: professorAssignments){
            
            sum = sum + fa.getRating();
            
        }
        //divide by the total number of faculty assignments
        
        return sum/(professorAssignments.size()*1.0); //this ensure we have double/double
        
    }

    public ProfessorAssignment AssignAsTeacher(CourseOffer co){
        
        ProfessorAssignment fa = new ProfessorAssignment(this, co);
        professorAssignments.add(fa);
        
        return fa;
    }
    
    public Professor getCourseOffer(String courseid){
        return null; //complete it later
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public ArrayList<ProfessorAssignment> getProfessorAssignments() {
        return professorAssignments;
    }

    public void setProfessorAssignments(ArrayList<ProfessorAssignment> professorAssignments) {
        this.professorAssignments = professorAssignments;
    }

    public boolean isMatch(String id) {
        if (person.getPersonID().equals(id)) {
            return true;
        }
        return false;
    }
}
