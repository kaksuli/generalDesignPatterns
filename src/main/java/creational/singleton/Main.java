package creational.singleton;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("creational.singleton.Main");

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton instanceOne = Singleton.getInstance();
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"))) {
            out.writeObject(instanceOne);
        }

        //deserialize from file to object
        Singleton instanceTwo;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"))) {
            instanceTwo = (Singleton) in.readObject();
        }

        logger.info("instanceOne hashCode="+instanceOne.hashCode());
        logger.info("instanceTwo hashCode="+instanceTwo.hashCode());

    }

}