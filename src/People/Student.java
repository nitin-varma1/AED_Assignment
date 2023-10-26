/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.Transcript;
import java.util.ArrayList;
/**
 *
 * @author kal bugrara
 */
public class Student{
    Person person;
    String StudentID;
    Transcript transcript;
    ArrayList<CourseOffer> currentCourses;
    public Student(Person p) {
        person = p;
        transcript = new Transcript(this);
        currentCourses = new ArrayList<CourseOffer>();
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
    
    public Boolean isMatch(String id){
        if(StudentID.equals(id))
            return true;
        return false;
    }
    public boolean dropCourses(CourseOffer courseDrop){
        for(CourseOffer cr: currentCourses){
            if(cr==courseDrop){
                currentCourses.remove(cr);
                return true;
            }
        }
        return false;
    }
}
