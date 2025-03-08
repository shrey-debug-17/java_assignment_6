// Wooden Duck which cannot fly or swim (it sinks)
public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NotFly(), new Drown());
    }

    public void display() {
        System.out.println("I am a Wooden Duck.");
    }
}
