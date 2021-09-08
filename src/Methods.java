import java.io.*;

public class Methods {


    public static void serialize(Serializable object, File file) throws IOException {
        OutputStream outStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(outStream);
        oos.writeObject(object);
        oos.close();
        outStream.close();
    }

    public static Serializable deserialize(File file) throws IOException, ClassNotFoundException {
        InputStream inStream = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(inStream);
        Serializable object = (Serializable) ois.readObject();
        ois.close();
        inStream.close();

        return object;
    }
}
