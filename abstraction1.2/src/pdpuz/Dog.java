package pdpuz;

class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void live() {
        System.out.println("Dog lives in a house.");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with a ball.");
    }
}
