/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    ArrayList<Student> studentlist;

    public StudentDirectory() {

        studentlist = new ArrayList();

    }

    public Student newStudentProfile(Person p) {

        Student sp = new Student(p);
        studentlist.add(sp);
        return sp;
    }

    public Student findStudent(String id) {

        for (Student sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
