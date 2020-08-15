package structural.composite;

import java.util.logging.Logger;

//Composite Design Pattern Leaf Objects
public class Triangle implements Shape {
	private static final Logger logger = Logger.getLogger("structural.composite.Triangle");

	@Override
	public void draw(String fillColor) {
		logger.info("Drawing Triangle with color " + fillColor);
	}

}