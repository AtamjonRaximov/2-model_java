package pdpuz;

class Parent extends Person {
    public Parent(String name, String phone) {
        super(name, phone);
    }

    @Override
    void speak() {
        System.out.println(name + " (Parent) is speaking with the teacher.");
    }

    @Override
    void walk() {
        System.out.println(name + " (Parent) is walking in the park.");
    }
}
