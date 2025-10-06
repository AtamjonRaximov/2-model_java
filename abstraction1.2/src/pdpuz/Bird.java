package pdpuz;

class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird eats seeds.");
    }

    @Override
    public void live() {
        System.out.println("Bird lives in a nest.");
    }
}
