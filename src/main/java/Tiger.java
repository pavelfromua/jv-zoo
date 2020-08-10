public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println(getClass().getName() + " eats meat");
    }
}
