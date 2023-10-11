package inputOtput.readers;

import java.io.IOException;
import java.io.InputStreamReader;

public class testReader {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);  // adapter InputStreamReader
        for (int x = 0 ; x != 48;) {
            //x = System.in.read();
            x = reader.read();
            System.out.println((char)169);
        }
        reader.close();
    }
}