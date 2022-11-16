package regex;

public class TestRegex {
    public static void main(String[] args) {
        String str = "My Phone number is out of range. This is Mark";
        str = str.replaceAll("^(\\w+)(.*)([ ]+)(\\w+)$", "$4$3$2$3$1");
        System.out.print(str);
    }
}
