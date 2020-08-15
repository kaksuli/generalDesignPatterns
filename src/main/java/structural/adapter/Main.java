package structural.adapter;

import java.util.logging.Logger;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together.
 * The object that joins these unrelated interface is called an Adapter.
 *
 * @author sulaiman kadkhodaei
 *
 * One of the great real life example of Adapter design pattern is mobile charger.
 * Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
 * So the mobile charger works as an adapter between mobile charging socket and the wall socket.
 *
 * Two Way Adapter Pattern:
 * While implementing Adapter pattern, there are two approaches – class adapter and object adapter – however both these approaches produce same result.
 *
 * Adapter Design Pattern Example in JDK:
 *
 * java.util.Arrays#asList()
 * java.io.InputStreamReader(InputStream) (returns a Reader)
 * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */
public class Main {
	private static final Logger logger = Logger.getLogger("structural.adapter.Main");

	public static void main(String[] args) {

		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();

		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);

		logger.info("v3 volts using Object Adapter=" + v3.getVolts());
		logger.info("v12 volts using Object Adapter=" + v12.getVolts());
		logger.info("v120 volts using Object Adapter=" + v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();

		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);

		logger.info("v3 volts using Class Adapter=" + v3.getVolts());
		logger.info("v12 volts using Class Adapter=" + v12.getVolts());
		logger.info("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
			case 3:
				return sockAdapter.get3Volt();
			case 12:
				return sockAdapter.get12Volt();
			case 120:
			default:
				return sockAdapter.get120Volt();
		}
	}
}