package input_output;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Start sequence");
        System.in.read(data);
        System.out.println("Your symbols: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);
        }

    }
}
