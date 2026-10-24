# Assignment #5 — Strategy Pattern

## Course Information
* **Course:** Software Design Patterns (ShP-2216)
* **Institution:** Astana IT University
* **Topic:** Option A — Navigation / Route Planning

## Project Structure
* `strategy/RouteStrategy.java` — Strategy interface defining the core algorithm contract.
* `strategy/CarStrategy.java` — Concrete strategy for driving route calculation.
* `strategy/WalkStrategy.java` — Concrete strategy for pedestrian route calculation.
* `strategy/CycleStrategy.java` — Concrete strategy for cycling route calculation.
* `strategy/Navigator.java` — Context class that delegates execution and supports runtime strategy switching.
* `strategy/Main.java` — Client class demonstrating runtime configuration and execution.

## Clean Code Principles Applied
1. **Elimination of Conditional Logic:** Replaced `if-else`/`switch` statements with polymorphism.
2. **Single Responsibility Principle (SRP):** Each strategy class handles exactly one algorithm.
3. **Isolating from Change:** Context depends only on the interface, allowing new strategies without modifying existing code.
4. **Separation of Concerns:** Instantiation and injection handled by the client (`Main`).
5. **Testability:** Small, decoupled classes ensure clean unit testing.