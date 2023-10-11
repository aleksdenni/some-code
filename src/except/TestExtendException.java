package except;

import java.io.IOException;

public class TestExtendException {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("Throw!");
        }
    }

    public static void method() throws MyException {
        throw new MyException();
    }

    static class MyException extends IOException {

    }
}
