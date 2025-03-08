// Rubber Duck which cannot fly but can float
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NotFly(), new Float());
    }

    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
