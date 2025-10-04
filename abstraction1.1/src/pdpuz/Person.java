package pdpuz;

abstract class Person {
    String name;
    String phone;


    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    abstract void speak();
    abstract void walk();
}
