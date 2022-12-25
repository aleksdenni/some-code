import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            //readFile();
            readInt();
        } catch (RuntimeException e) {
            var ex = e.getCause().getClass();

            if (ex.equals(FileNotFoundException.class)) {
                System.out.println("File not found");
            }
            if (ex.equals(NumberFormatException.class)
                    || ex.equals(InputMismatchException.class)) {
                System.out.println("введіть ціле число");
            }

        }
    }

    public static void readFile() {
        File file = new File("wwq");
        try (Scanner sc = new Scanner(file)) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readInt() {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
