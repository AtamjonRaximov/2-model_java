package pdpuz;

class Cat implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void live() {
        System.out.println("Cat lives in a house.");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with yarn.");
    }
}

