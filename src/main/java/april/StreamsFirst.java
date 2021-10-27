package april;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class StreamsFirst {
    private ArrayList<Integer> list;

    public void write(int data) {
        list.add(data);
    }

    public int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available() {
        return list.size();
    }

    public static void main(String[] args) throws Exception {
        StreamsFirst myObject = new StreamsFirst();
        OutputStream outStream = new FileOutputStream("c:/my-object-data.txt");

        while (myObject.available() > 0) {
            int data = myObject.read(); //читаем один int из потока для чтения
            outStream.write(data); //записываем прочитанный int в другой поток.
        }

        outStream.close();
    }

}

