package TestTask;


import java.util.*;
import java.util.regex.Pattern;

public class Task1 {
    Long l;

    LinkedList<?> ll;
    TreeMap<?, ?> tm;
    HashMap<?, ?> hm;

    public static void main(String[] args) throws InterruptedException {

        List<String> inList = new ArrayList<>(List.of("Aleks","na*^an@a.com",
                " ","あいうえお@domain.com","aleks@gmail.com","Ярік@com.ua","-","+","іїєФ", "jkjf kjdfj-ll","bs", "AlSxj-jhjsdkk"));


        inList.stream()
                .filter(s -> s.matches("^[a-zA-Z][a-zA-Z\s\\-]{0,22}[a-zA-Z]$"))
                .toList()
                .forEach(System.out::println);

//        String input = "aleks";
//        String result = Pattern.compile("^.").matcher(input).replaceFirst(m -> m.group().toUpperCase());
//        System.out.println(result);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1 task1 = (Task1) o;
        return Objects.equals(l, task1.l) && Objects.equals(ll, task1.ll) && Objects.equals(tm, task1.tm) && Objects.equals(hm, task1.hm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, ll, tm, hm);
    }
}


// ім'я "^[^\\d!@#$%^&*()+\\[\\]{};:'\\\"<>?,./|`~\\\\]+"                  ^[a-zA-Z][-a-zA-Z\s]{0,22}[a-zA-Z]$
//      + "(-[^\\d!@#$%^&*()+\\[\\]{};:'\\\"<>?,./|`~\\\\]+)"
//      + "?( [^\\d!@#$%^&*()+\\[\\]{};:'\\\"<>?,./|`~\\\\]+)?$"

//мейл  "^(?=.{10,63}$)(?!.*\\s)[a-zA-Z0-9!#$%&'*+\\-=?^_`{|}~]"
//      + "+(?:[.\\-][a-zA-Z0-9!#$%&'*+\\-=?^_`{|}~]+)*"
//      + "@[a-z0-9](?:[a-z0-9\\-]*[a-z0-9])*"
//      + "(?:\\.[a-z0-9](?:[a-z0-9\\-]*[a-z0-9])*)+"

//пасс "^(?=.*[A-Za-z])(?=.*\\d)"
//      + "(?=.*[!\"#$%&'()*+,\\-./:;<=>?@[\\\\]^_{|}~])"
//      + "[A-Za-z\\d!\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]{8,32}$"