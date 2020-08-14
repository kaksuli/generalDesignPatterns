package creational.prototype;

import java.util.List;
import java.util.logging.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger("creational.prototype.Main");

	public static void main(String[] args) throws CloneNotSupportedException {
		Alphabetic alphabetic = new Alphabetic();
		alphabetic.loadData();

		//Use the clone method to get the Alphabetic object
		Alphabetic alphabeticNew = (Alphabetic) alphabetic.clone();
		Alphabetic alphabeticNew1 = (Alphabetic) alphabetic.clone();

		List<String> list = alphabeticNew.getAlphabeticList();
		list.add("E");
		List<String> list1 = alphabeticNew1.getAlphabeticList();
		list1.remove("A");

		logger.info("alphabetic List: " + alphabetic.getAlphabeticList());
		logger.info("alphabeticNew List: " + list);
		logger.info("alphabeticNew1 List: " + list1);
	}

}