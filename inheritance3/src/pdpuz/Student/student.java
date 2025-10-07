package pdpuz.Student;

import pdpuz.Person.*;
import pdpuz.Phone.*;

public class student extends person {
    private String parentNumber;
    private int SchoolNumber;
    private phone phoneCLass;


    public student(String name, String phone, String password, String parentNumber, int schoolNumber, phone phone1) {
        super(name, phone, password);
        this.parentNumber = parentNumber;
        this.SchoolNumber = schoolNumber;
        this.phoneCLass = phone1;
    }

    public void call(String number) {
        System.out.println(name + " is calling " + number);
    }
}
