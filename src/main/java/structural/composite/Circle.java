package structural.composite;

import java.util.logging.Logger;

//Composite Design Pattern Leaf Objects
public class Circle implements Shape {
	private static final Logger logger = Logger.getLogger("structural.composite.Circle");

	@Override
	public void draw(String fillColor) {
		logger.info("Drawing Circle with color " + fillColor);
	}

}