package pdpuz;


public class app {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.live();
        lion.hunt();

        Dog dog = new Dog();
        dog.eat();
        dog.live();
        dog.play();

        Cat cat = new Cat();
        cat.eat();
        cat.live();
        cat.play();

        Bird bird = new Bird();
        bird.eat();
        bird.live();
    }

}

