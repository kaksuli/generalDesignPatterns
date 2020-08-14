package creational.factory;

/**
 * The factory design pattern is used when we have a superclass with multiple sub-classes and based on input,
 * we need to return one of the sub-class.
 * This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 *
 * @author sulaiman kadkhodaei
 *
 * Some important points about Factory Design Pattern method are:
 *
 * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
 * Notice that based on the input parameter, different subclass is created and returned.
 * getComputer is the factory method.
 *
 * Factory Design Pattern Advantages:
 *
 * Factory design pattern provides approach to code for interface rather than implementation.
 * Factory pattern removes the instantiation of actual implementation classes from client code.
 * Factory pattern makes our code more robust, less coupled and easy to extend.
 * For example, we can easily change PC class implementation because client program is unaware of this.
 * Factory pattern provides abstraction between implementation and client classes through inheritance.
 *
 * Factory Design Pattern Examples in JDK:
 *
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}