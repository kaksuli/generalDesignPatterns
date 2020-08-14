package creational.factory;

import java.util.logging.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger("creational.factory.Main");

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

		logger.info("Factory PC Config::" + pc);
		logger.info("Factory Server Config::" + server);
	}

}