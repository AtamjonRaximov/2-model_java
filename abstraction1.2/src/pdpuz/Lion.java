package pdpuz;

class Lion implements Animal, Wild {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void live() {
        System.out.println("Lion lives in the jungle.");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts animals.");
    }
}
