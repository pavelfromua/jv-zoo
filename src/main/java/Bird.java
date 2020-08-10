public abstract class Bird extends Creature implements Flyable {
    @Override
    public void eat() {
        System.out.println(getClass().getName() + " eats corn");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly");
    }
}
