package lambda;

import java.util.Objects;

public final class TempClass {
    private final double re;
    private final double im;

    public static void main(String[] args) {
        String inputStr = "Привіт";// я перший рядок який зайшов в цей метод";

            String[] words = inputStr.split(" ");
// тут у нас буде масив слів  { "Привіт", "я", "перший", "рядок", "який", "зайшов", "в", "цей", "метод"}
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i].charAt(0));
        }
        System.out.println(sb.toString().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempClass tempClass = (TempClass) o;
        return Double.compare(tempClass.re, re) == 0 && Double.compare(tempClass.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public TempClass(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}