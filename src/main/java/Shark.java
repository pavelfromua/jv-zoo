public class Shark extends Fish {
    @Override
    public void eat() {
        System.out.println(getClass().getName() + " eats fish and other animals");
    }
}
