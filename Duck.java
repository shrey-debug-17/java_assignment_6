// Abstract class for all ducks
public abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public abstract void display();
}
