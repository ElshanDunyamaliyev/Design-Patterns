The Memento Pattern is a behavioral design pattern that provides the ability to restore an object to its previous state (undo or rollback functionality) without exposing its internal structure. It is particularly useful when an object’s state must be saved and restored later, ensuring encapsulation is preserved.

Components of Memento Pattern
1. Originator:
   * The object whose state you want to save or restore.
   * Provides methods to create and restore mementos.
2. Memento:
   * The object that stores the state of the Originator.
   * It is usually a lightweight object with no functionality other than storing the state.
3. Caretaker:
   * Manages the mementos, keeping track of the Originator's history.
   * It does not modify or inspect the content of the memento, ensuring encapsulation.