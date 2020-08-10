public class Penguin extends Bird implements Swimable {
    @Override
    public void swim() {
        System.out.println("penguine swims");
    }

    @Override
    public void fly() {
        swim();
    }

    @Override
    public void eat() {
        System.out.println(getClass().getName() + " eats fish");
    }
}
