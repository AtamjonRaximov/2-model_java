package pdpuz;

class Teacher extends Person {
    public Teacher(String name, String phone) {
        super(name, phone);
    }

    @Override
    void speak() {
        System.out.println(name + " (Teacher) is giving a lecture.");
    }

    @Override
    void walk() {
        System.out.println(name + " (Teacher) is walking to classroom.");
    }
}

