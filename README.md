# Online-Shop

Added Structural and Behavior Design Patterns

**Step 1**: Implemented Decorator Pattern (Structural)
1. Refactored Product class hierarchy to support decorators.

2. Created an abstract ProductDecorator class that wraps a Product.

3. Added concrete decorators: GiftWrapDecorator (adds gift wrap cost) and DiscountDecorator (applies discount).

4. Modified Shop to decorate products dynamically based on purchase options (gift wrap, discount).

**Step 2**: Implemented Adapter Pattern (Structural)
1. Introduced a hypothetical external billing system with a different interface (GovtBillingSystem).

2. Created BillingAdapter class extending Billing that adapts calls to the external billing system.

3. Allowed Shop to use either internal billing or external billing transparently.

**Step 3**: Implemented Observer Pattern (Behavioral)
1. Defined Observer interface and Subject class to manage observers.

2. Made Shop extend Subject to notify observers of checkout events.

3. Created concrete observers:

4. InventoryObserver (to update stock)

5. AnalyticsObserver (to track sales)

6. Registered observers in the Shop.

7. Observers receive updates after each checkout.

**Step 4**: Implemented Command Pattern (Behavioral)
Defined Command interface with execute() method.

1. Created concrete commands:

2. PurchaseCommand to encapsulate buying a product.

3. CheckoutCommand to encapsulate the checkout process.

4. Created CommandInvoker to execute commands and maintain a history.

5. Modified business logic flows in Main to use command objects for buying and checking out products.