public class AviaryForAnimals<T extends Creature> extends Area<T> {
    @Override
    public void feed() {
        System.out.println(getClass().getName() + " starts feeding...");

        for (Creature creature: getInhabitants()) {
            creature.eat();
        }

        System.out.println("Finish feeding...");
        System.out.println();
    }
}
