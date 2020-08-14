package creational.abstract_factory;

import creational.factory.Computer;

import java.util.logging.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger("creational.abstract_factory.Main");

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

		logger.info("AbstractFactory PC Config::" + pc);
		logger.info("AbstractFactory Server Config::" + server);
	}
}