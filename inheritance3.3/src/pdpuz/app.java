package pdpuz;

import pdpuz.Person.*;
import pdpuz.Phone.phone;
import pdpuz.Student.*;

public class app {
    public static void main(String[] args) {

        student[] students = {
                new student("Atamjon", "+998939990315", "003", "+9989322323", 10, new phone("Samsung", 128, "red")),
                new student("zafar", "+998970899232", "222", "+9989300099900", 21, new phone("mi", 256, "black")),
                new student("tora", "+99892232222", "333", "+93882983", 16, new phone("iphone", 512, "white"))
        };



        student newStudent = new student("Ali", "+99892232222", "ali123", "99890", 82, new phone("nokia", 32, "blue"));

        String oldpassword = "333";
        String newpassword = "777";

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].phone.equals(newStudent.phone)) {
                students[i].reset(oldpassword, newpassword);
                found = true;
                break;
            }
        }

    }



}
