package april;

import java.io.*;

public class BufferedInputExample {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("D:/someFile.txt");

            buffer = new BufferedInputStream(inputStream);

            while (buffer.available() > 0) {

                char c = (char) buffer.read();

                System.out.println("Был прочитан символ " + c);
            }
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("testFile.txt"));

        dos.writeUTF("someFile.txt");
        dos.writeInt(22);
        dos.writeDouble(1.21323);
        dos.writeBoolean(true);


    }
}