# Online-Shop

Step 1: Poorly Designed Code Example (Java, OOP, Cross Dependencies)
Scenario:
A shop sells products. Products can be “Pen” or “Notebook.” Every product must be billed, and billing is done directly in the product class. The Shop creates products and calculates bills. There’s also some direct logging in multiple places.

Classes:
Product
Shop
Billing
Logger


Step 2: Analysis—Violations and Problems
Single Responsibility Principle: Product, Billing, and Shop all handle logging.

Tight Coupling: Billing depends on Product’s tax logic; Shop depends directly on Billing and Logger.

Cross Dependency: Multiple classes are responsible for logging, and Billing directly invokes Product’s business logic.

Open/Closed Principle: Adding new billing strategies or changing tax logic means editing multiple classes.

Maintainability: Hard to test or extend the product calculation or billing separately; logging is scattered.
