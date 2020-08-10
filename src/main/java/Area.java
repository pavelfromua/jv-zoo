import java.util.ArrayList;

public abstract class Area<T extends Creature> {
    private ArrayList inhabitants = new ArrayList<>();

    public ArrayList<T> getInhabitants() {
        return inhabitants;
    }

    public void settle(T inhabitant) {
        inhabitants.add(inhabitant);
    }

    public void display() {
        for (T creature: getInhabitants()) {
            System.out.println(creature);
        }
    }
    
    public void feed() {
        System.out.println("Start feeding...");

        for (Creature creature: getInhabitants()) {
            creature.eat();
        }

        System.out.println("Finish feeding...");
    }
}
