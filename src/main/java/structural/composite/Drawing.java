package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * When we need to create a structure in a way that the objects in the structure has to be treated the same way, we can apply composite design pattern.
 *
 * Lets understand it with a real life example – A diagram is a structure that consists of Objects such as Circle, Lines, Triangle etc.
 * When we fill the drawing with color (say Red), the same color also gets applied to the Objects in the drawing.
 * Here drawing is made up of different parts and they all have same operations.
 *
 * @author sulaiman kadkhodaei
 *
 * Composite Pattern consists of following objects:
 *
 * Base Component – Base component is the interface for all objects in the composition, client program uses base component to work with the objects in the composition.
 * It can be an interface or an abstract class with some methods common to all the objects.
 *
 * Leaf – Defines the behaviour for the elements in the composition.
 * It is the building block for the composition and implements base component. It doesn’t have references to other Components.
 *
 * Composite – It consists of leaf elements and implements the operations in base component.
 *
 * Composite Pattern Important Points:
 *
 * Composite pattern should be applied only when the group of objects should behave as the single object.
 * Composite design pattern can be used to create a tree like structure.
 *
 * Composite Design Pattern Example in JDK:
 *
 * java.awt.Container#add(Component) is a great example of Composite pattern in java and used a lot in Swing.
 */

//Composite object
//A composite object contains group of leaf objects and we should provide some helper methods to add or delete leafs from the group. We can also provide a method to remove all the elements from the group.
public class Drawing implements Shape{
	private static final Logger logger = Logger.getLogger("structural.composite.Drawing");

	//collection of Shapes
	private List<Shape> shapes = new ArrayList<>();
	
	@Override
	public void draw(final String fillColor) {
		shapes.forEach(shape -> shape.draw(fillColor));
	}
	
	//adding shape to drawing
	public void add(Shape s){
		this.shapes.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		logger.info("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}