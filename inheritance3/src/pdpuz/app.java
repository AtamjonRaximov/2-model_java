package pdpuz;

import pdpuz.Person.*;
import pdpuz.Phone.phone;
import pdpuz.Student.*;

public class app {
    public static void main(String[] args) {

        student[] students = new student[3];
        students[0] = new student("Atamjon", "+998939990315", "003", "+9989322323", 10, new phone("Samsung", 128, "red"));
        students[1] = new student("zafar", "+998970899232", "222", "+9989300099900", 21, new phone("mi", 256, "black"));
        students[2] = new student("tora", "+99892232222", "333", "+93882983", 16, new phone("iphone", 512, "white"));


        resetPassword(students, "+998970899232", "222", "newww");

    }

    public static void resetPassword(student[] students, String phone, String oldPassword, String newPassword) {
        for (student student : students) {
            if (student.phone.equals(phone) && student.getPassword().equals(oldPassword)) {
                student.reset(oldPassword, newPassword);
                return;
            }
        }
        System.out.println("Student not found or old password incorrect!");
    }


}
