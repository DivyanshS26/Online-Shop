# Online-Shop

Till now we have used Creational Design Pattern and partial Structural Design Pattern

**Step 1**: Design Patterns Selection

1. Factory Method to decouple product creation from Shop.

2. Strategy Pattern to separate tax/bill calculation logic.

3. Centralized Logger to remove logging cross-dependency.


**Step 2**: Refactoring the code

**Step 3**: How Design Patterns Improved the Code
Reduced Coupling: 
1. Shop, Product, Billing, and Logger are loosely coupled. Each fulfills a distinct role.

2. Single Responsibility Principle: Logging, product creation, and billing are each handled by their own class.

3. Open/Closed Principle: Easily add new products, tax strategies, or change logic without modifying existing classes.

4. Maintainability and Testability: Each class can be tested in isolation; changes are less likely to impact unrelated parts.