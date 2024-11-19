Chain Of Responsibility Design Pattern:
The Chain of Responsibility (CoR) design pattern is a behavioral design pattern that allows a request to pass through a chain of handlers until it is processed by one of them. Each handler in the chain decides either to process the request or to pass it to the next handler in the chain.

This pattern decouples the sender of a request from its receivers by allowing multiple objects to handle the request dynamically without hard-coding the handlers.

Key Concepts:
1. Request Sender: The client that makes the request.
2. Handler: An interface or abstract class defining a method to handle requests. Concrete handlers implement this interface.
3. Next Handler: Each handler keeps a reference to the next handler in the chain.

Structure:
1. Handler Interface/Abstract Class:
   * Defines a method to handle requests.
   * Typically, includes a reference to the next handler.
2. Concrete Handlers:
   * Implement the handler interface.
   * Decide whether to process the request or pass it along the chain.
3. Client:
   * Sends the request to the first handler in the chain.

