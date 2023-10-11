package TestTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class And {
    private static final Path INPUT_PATH = Path.of("input.txt");
    private static final Path OUTPUT_PATH = Path.of("output.txt");

    public static void main(String[] args) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(INPUT_PATH)) {
            Operation operation = new Operation();
            while ((line = reader.readLine()) != null) {
                operation.lines(line);
            }
            Files.writeString(OUTPUT_PATH, operation.getStrOut());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Operation {
    private final TreeMap<Integer, Integer> askMap = new TreeMap<>();
    private final TreeMap<Integer, Integer> bidMap = new TreeMap<>();
    private final StringBuilder strOut = new StringBuilder();

    public void lines(String line) {
        if (line.startsWith("u")) {
            update(line);
        } else if (line.startsWith("q")) {
            query(line);
        } else if (line.startsWith("o")) {
            order(line);
        }
    }
    public String getStrOut() {
        return strOut.toString();
    }
    private void query(String line) {
        if (line.contains("best_bid")) {
            strOut.append(bidMap.lastKey()).append(",")
                    .append(bidMap.lastEntry().getValue()).append(java.lang.System.lineSeparator());
        } else if (line.contains("best_ask")) {
            strOut.append(askMap.firstKey()).append(",")
                    .append(askMap.firstEntry().getValue()).append(java.lang.System.lineSeparator());
        } else if (line.contains("size")) {
            int price = Integer.parseInt(line.substring(7));
            if (bidMap.containsKey(price)) {
                strOut.append(bidMap.get(price)).append(java.lang.System.lineSeparator());
            } else if (askMap.containsKey(price)) {
                strOut.append(askMap.get(price)).append(java.lang.System.lineSeparator());
            } else {
                strOut.append(0).append(java.lang.System.lineSeparator());
            }
        }
    }
    private void order(String line) {
        String[] args = line.split(",");
        if (line.contains("sell")) {
            int sell = Integer.parseInt(args[2]);
            while (sell != 0) {
                int size = bidMap.lastEntry().getValue() - sell;
                if (size <= 0) {
                    sell = Math.abs(size);
                    bidMap.remove(bidMap.lastKey());
                } else {
                    sell = 0;
                    bidMap.put(bidMap.lastKey(), size);
                }
            }
        } else {
            int buy = Integer.parseInt(args[2]);
            while (buy != 0) {
                int size = askMap.firstEntry().getValue() - buy;
                if (size <= 0) {
                    buy = Math.abs(size);
                    askMap.remove(askMap.firstKey());
                } else {
                    buy = 0;
                    askMap.put(askMap.firstKey(), size);
                }
            }
        }
    }
    private void update(String line) {
        String[] args = line.split(",");
        int price = Integer.parseInt(args[1]);
        int size = Integer.parseInt(args[2]);
        if (line.contains("ask")) {
            if (size == 0) {
                askMap.remove(price);
            } else {
                askMap.put(price, size);
            }
        } else {
            if (size == 0) {
                bidMap.remove(price);
            } else {
                bidMap.put(price, size);
            }
        }
    }
}