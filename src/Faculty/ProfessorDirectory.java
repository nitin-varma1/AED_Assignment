package Faculty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import People.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class ProfessorDirectory {

    ArrayList<Professor> teacherlist;

    public ProfessorDirectory() {

        teacherlist = new ArrayList();

    }

    public Professor newFacultyProfile(Person p) {

        Professor sp = new Professor(p);
        teacherlist.add(sp);
        return sp;
    }
    
    public Professor getTopProfessor(){
        
        double bestratingsofar = 0.0;
        Professor BestProfSofar = null;
        for(Professor fp: teacherlist)
           if(fp.getProfAverageOverallRating()>bestratingsofar){
           bestratingsofar = fp.getProfAverageOverallRating();
           BestProfSofar = fp;
           }
        return BestProfSofar;
        
    }

    public Professor findTeachingFaculty(String id) {

        for (Professor sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
