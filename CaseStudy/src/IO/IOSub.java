package IO;

import java.io.*;

public class IOSub {
    public IOSub() {
    }

    public void writeObjectToFile(Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\PC\\OneDrive\\Desktop\\employee.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Object readFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            objectIn.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
