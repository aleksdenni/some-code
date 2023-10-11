package permutation;

import java.util.ArrayList;
import java.util.List;

public class CheckStrings {
    public static void main(String[] args) {
        String[] message = new String[]{"excavate", "excess", "screen", "endure", "desire", "theater", "night"};
        String[] message1 = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
        String[] message2 = new String[]{"screen", "desire", "theater", "excess", "night"};
        String[] message3 = new String[]{"cycle", "east", "traffic"};
        String[] message4 = new String[]{"kilo", "ok", "okay", "yellow"};

        System.out.println(check3(message)); //true
        System.out.println(check3(message1)); //false
        System.out.println(check3(message2)); //true
        System.out.println(check3(message3)); //true
        System.out.println(check3(message4));

    }

    static boolean checkSequence(String[] arr) {
        boolean isCorrect = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].endsWith(arr[i + 1].substring(0, 1))) {
            } else return false;
        }
        return isCorrect;
    }

    public static boolean check(String[] str) {
        int counter = 0;
        for (int i = 0; i < str.length - 1; ) {
            boolean isTrue = false;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].endsWith(str[j].substring(0, 1))) {
                    isTrue = true;
                    mix(str, i + 1, j);
                    break;
                }
            }
            if (!isTrue && counter < str.length) {
                String[] arr = new String[str.length];
                arr[0] = str[i + 1];
                for (int j = 0, k = 1; j < str.length; j++) {
                    if (j == i + 1) continue;
                    arr[k++] = str[j];
                }
                str = arr;
                i = 0;
                counter++;
                continue;
            }
            ++i;
        }
        return checkSequence(str);
    }

    public static boolean check2(String[] str) {
        List<String> list = new ArrayList<>(List.of(str));
        int counter = 0;

        for (int i = 0; i < list.size() - 1; ) {
            ++i;
            for (int j = i + 1; j <= list.size(); j++) {
                if (list.get(i - 1).endsWith(list.get(j - 1).substring(0, 1))) {
                    if (i + 1 == j) {
                        break;
                    }
                    list.add(i, list.get(j - 1));
                    list.remove(j);
                    break;
                }
                if (!list.get(i - 1).endsWith(list.get(i).substring(0, 1))
                        && j == list.size()) {
                    list.add(0, list.get(i));
                    list.remove(i + 1);
                    counter++;
                    i = 0;
                }
            }
            if (counter >= list.size()) return false;
        }
        return true;
    }

    public static boolean check3(String[] millipede) {
        StringBuilder joined = new StringBuilder(millipede[0]);
        millipede[0] = "-";
        for (int i = 0; i < millipede.length / 2; i++) {
            for (int j = 1; j < millipede.length; j++) {
                if (joined.charAt(joined.length() - 1) == millipede[j].charAt(0)) {
                    joined.append(millipede[j]);
                    millipede[j] = "-";
                } else if (joined.charAt(0) == millipede[j].charAt(millipede[j].length() - 1)) {
                    joined.insert(0, millipede[j]);
                    millipede[j] = "-";
                }
            }
        }
        return String.join("-", millipede).matches("-+");
    }

    static void mix(String[] arr, int n1, int n2) {
        String temp;
        temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}


    /*
зміщення не співпадаючого на початок
якщо немає співпадіння після - ставимо в кінець
      "screen",
         "night"
    "excavate"
    -   "theater",
    , "endure",
     "desire",
        "excess",
можна покращити продуктивність зберігаючи співпадаючий блок. І також через List простіше мабуть
         };
    String[] message1 = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
    String[] message2 = new String[]{"screen", "desire", "theater", "excess", "night"};
    String[] message3 = new String[]{"cycle", "east", "traffic"};

        System.out.println(check(message)); //true
                System.out.println(check(message1)); //false
                System.out.println(check(message2)); //true
                System.out.println(check(message3)); //true
                */