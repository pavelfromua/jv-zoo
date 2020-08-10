public abstract class Fish extends Creature {
    @Override
    public void eat() {
        System.out.println(getClass().getName() + " eats worms");
    }
}
