import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a Duck Type:");
            System.out.println("1. Mallard Duck\n2. Rubber Duck\n3. Wooden Duck\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Duck duck = null;

            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RubberDuck();
                    break;
                case 3:
                    duck = new WoodenDuck();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    continue;
            }

            if (duck != null) {
                duck.display();
                duck.performFly();
                duck.performSwim();
            }

        } while (choice != 4);

        sc.close();
    }
}
