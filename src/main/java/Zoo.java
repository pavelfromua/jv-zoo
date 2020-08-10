public class Zoo {
    public static void main(String[] args) {
        AviaryForAnimals aviaryForAnimals = new AviaryForAnimals();
        aviaryForAnimals.settle(new Tiger());

        AviaryForBirds aviaryForBirds = new AviaryForBirds();
        aviaryForBirds.settle(new Sparrow());

        Aquarium<Creature> aquarium = new Aquarium();
        aquarium.settle(new Penguin());
        aquarium.settle(new Shark());

        aviaryForAnimals.feed();
        aviaryForBirds.feed();
        aquarium.feed();
    }
}
