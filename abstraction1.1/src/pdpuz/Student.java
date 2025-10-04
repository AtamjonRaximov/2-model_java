package pdpuz;

class Student extends Person {
    public Student(String name, String phone) {
        super(name, phone);
    }

    @Override
    void speak() {
        System.out.println(name + " (Student) is speaking about homework.");
    }

    @Override
    void walk() {
        System.out.println(name + " (Student) is walking to school.");
    }
}
