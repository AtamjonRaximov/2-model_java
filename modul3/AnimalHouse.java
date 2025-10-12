package pdpuz;

class AnimalHouse<T extends Animal> {
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void makeAnimalSound() {
        if (animal != null) {
            animal.makesound();
        } else {
            System.out.println("no animal sound!!");
        }
    }
}
