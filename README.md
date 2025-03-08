📌 Overview

This project implements the Strategy Design Pattern to simulate different duck behaviors such as flying and swimming. Each duck can have different behaviors, and these behaviors are assigned dynamically using interfaces and composition rather than inheritance.

The Strategy Pattern allows for easy modification and extension of duck behaviors without changing the existing classes.

📜 Table of Contents

Introduction

Design Pattern Used

Project Structure

Duck Behaviors

Class Diagram

Example Output

Contributing

License

📖 Introduction


This Java program models different types of ducks and their behaviors using the Strategy Pattern. The program allows:

✔ Defining flying and swimming behaviors as separate interfaces.

✔ Implementing different behaviors like Fly, NotFly, Swim, Float, and Drown.

✔ Assigning behaviors dynamically without modifying existing classes.

✔ Using an interactive menu to test different duck types.



🛠 Design Pattern Used

This project uses the Strategy Pattern, which helps define a family of algorithms, encapsulate them, and make them interchangeable.

✅ Promotes flexibility and reusability.

✅ Eliminates the need for large if-else statements.

✅ Enhances maintainability.



📂 Project Structure


  📦 DuckStrategyPattern

 ┣
 
 📜 FlyBehavior.java         # Interface for flying behavior
 
 ┣ 📜 SwimBehavior.java        # Interface for swimming behavior
 
 ┣ 📜 Fly.java                 # Flying behavior implementation
 
 ┣ 📜 NotFly.java              # Non-flying behavior implementation
 
 ┣ 📜 Swim.java                # Swimming behavior implementation
 
 ┣ 📜 Float.java               # Floating behavior implementation
 
 ┣ 📜 Drown.java               # Drowning behavior implementation
 
 ┣ 📜 Duck.java                # Abstract Duck class

 ┣ 📜 MallardDuck.java         # Mallard Duck with Fly and Swim behaviors
 
 ┣ 📜 RubberDuck.java          # Rubber Duck with NotFly and Float behaviors
 
 ┣ 📜 WoodenDuck.java          # Wooden Duck with NotFly and Drown behaviors
 
 ┣ 📜 Main.java                # Menu-driven program for user interaction
 
 ┗ 📜 README.md                # Project Documentation



🦆 Duck Behaviors

Flying Behavior (FlyBehavior.java)

Fly.java → Ducks that can fly.

NotFly.java → Ducks that cannot fly.

Swimming Behavior (SwimBehavior.java)

Swim.java → Ducks that can swim.

Float.java → Ducks that float.

Drown.java → Ducks that sink (for wooden ducks).




📌 Class Diagram


📌 You need to generate a UML class diagram using IntelliJ IDEA (Professional Edition).

The diagram should include interfaces, classes, and relationships.



Example of the class diagram:



![022fig01 png](https://github.com/user-attachments/assets/95c169cd-070d-4f2b-a5a7-6008ae2fea9c)



EXAMPLE OUTPUT :


   Choose a Duck Type:
   1. Mallard Duck
   2. Rubber Duck
   3. Wooden Duck
   4. Exit
   Enter your choice: 1

   I am a Mallard Duck.
   This duck is flying!
   This duck is swimming.

   Choose a Duck Type:
   1. Mallard Duck
   2. Rubber Duck
   3. Wooden Duck
   4. Exit
   Enter your choice: 2

   I am a Rubber Duck.
   This duck cannot fly.
   This duck is floating.
   
   Choose a Duck Type:
   1. Mallard Duck
   2. Rubber Duck
   3. Wooden Duck
   4. Exit 
   Enter your choice: 3

   I am a Wooden Duck.
   This duck cannot fly.
   This duck is drowning!

   Exiting program.


🤝 Contributing

If you want to contribute:


Fork the repository :



Create a new branch (git checkout -b feature-newduck)

Commit changes (git commit -m "Added new duck type")

Push to the branch (git push origin feature-newduck)

Submit a Pull Request



📜 License

This project is open-source and follows the MIT License.



