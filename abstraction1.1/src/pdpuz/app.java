package pdpuz;


public class app {
    public static void main(String[] args) {
        Person s = new Student("Ali", "+9989011123");
        Person t = new Teacher("Otabek", "+99890877");
        Person p = new Parent("Dilnoza", "+998955100122");

        s.speak();
        s.walk();

        t.speak();
        t.walk();

        p.speak();
        p.walk();
    }
    
}

