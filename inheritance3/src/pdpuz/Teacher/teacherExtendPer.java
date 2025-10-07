package pdpuz.Teacher;
import pdpuz.Person.*;
import pdpuz.Subject.*;

public class teacherExtendPer extends person{
    public final subject subjectClass;
    private double Salary;

    public teacherExtendPer(String name, String phone, String password, subject subjectClass, double salary) {
        super(name, phone, password);
        this.subjectClass = subjectClass;
        Salary = salary;
    }

}
