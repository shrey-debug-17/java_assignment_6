// Mallard Duck with flying and swimming abilities
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Fly(), new Swim());
    }

    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}
