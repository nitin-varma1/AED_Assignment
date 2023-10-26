


import People.Person;
import info5100.university.example.Persona.User;
import java.util.ArrayList;
/**
 *
 * @author kal bugrara
 */
public class UserDirectory {

    ArrayList<User> studentlist;

    public UserDirectory() {

        studentlist = new ArrayList();

    }

    public User newUserAccount(Person p) {

        User sp = new User(p);
        studentlist.add(sp);
        return sp;
    }

    public User findStudent(String id) {

        for (User sp : studentlist) {

         //   if (sp.isMatch(id)) {
         //       return sp;
         //   }
        }
            return null; //not found after going through the whole list
         }
    
}
