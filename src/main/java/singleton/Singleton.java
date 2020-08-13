package singleton;

/**
 * Create the private constructor to avoid any new object creation with new operator.
 *
 * Declare a private static instance of the same class.
 *
 * Provide a public static method that will return the singleton class instance variable.
 *      If the variable is not initialized then initialize it or else simply return the instance variable.
 *
 * @author sulaiman kadkhodaei
 *
 * Use synchronized block inside the if loop and volatile variable
 * Pros:
 *
 * Thread safety is guaranteed
 * Client application can pass arguments
 * Lazy initialization achieved
 * Synchronization overhead is minimal and applicable only for first few threads when the variable is null.
 *
 * Cons:
 *
 * Extra if condition
 */

public class Singleton {

    /*
     volatile has semantics for memory visibility.
     Basically, the value of a volatile field becomes visible to all readers (other threads in particular) after a write operation completes on it.
      Without volatile, readers could see some non-updated value
     */
    private static volatile Singleton instance;

    private static final Object mutex = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new Singleton();
            }
        }
        return result;
    }

}
