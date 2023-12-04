package inputOtput;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class ChangeStream {
    public static void main(String[] args) {
        ChangeStream test = new ChangeStream();
        test.changeInput();
    }

    public void changeOut(){
        PrintStream justSystemOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);
        new ChangeStream().printSomething();
        System.setOut(justSystemOut);
        String[] byteArray = byteArrayOutputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
            if (i % 2 != 0)
                System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public void changeInput(){
        //InputStream is = new ByteArrayInputStream("Hello \nmy \nfriend".getBytes());
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printSomething(){
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
        System.out.println("fourth");
        System.out.println("fifth");
    }
}
