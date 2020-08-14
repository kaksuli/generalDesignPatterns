package creational.abstract_factory;

import creational.factory.Computer;

/**
 * In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class.
 * Then an Abstract Factory class that will return the sub-class based on the input factory class.
 * At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern.
 *
 * @author sulaiman kadkhodaei
 *
 * Abstract Factory can be interface or abstract class
 *
 * Abstract Factory Design Pattern Benefits:
 *
 * Abstract Factory design pattern provides approach to code for interface rather than implementation.
 * Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
 * Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 *
 * Abstract Factory Design Pattern Examples in JDK:
 *
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 * javax.xml.xpath.XPathFactory#newInstance()
 */
public interface ComputerAbstractFactory {
    Computer createComputer();
}
