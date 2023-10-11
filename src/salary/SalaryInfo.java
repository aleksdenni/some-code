package salary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class SalaryInfo {

    static private final int DATE_WORKING = 0;
    static private final int EMPLOYER_NAME = 1;
    static private final int HOURS_WORKING = 2;
    static private final int HOUR_RATE = 3;

    public static void main(String[] args) {
        String res = getSalaryInfo2(
                new String[]{"John","Andrew","Kate"}
                ,new String[]{"26.04.2019 John 4 50"
                             ,"05.04.2019 Andrew 3 200"
                             ,"10.04.2019 John 7 100"
                             ,"22.04.2019 Kate 9 100"
                             ,"25.06.2019 John 11 50"
                             ,"26.04.2019 Andrew 3 150"
                             ,"13.02.2019 John 7 100"
                             ,"26.04.2019 Kate 9 100"}
                ,"01.04.2019"
                , "30.04.2019");
        System.out.println(res);
    }

    public static String getSalaryInfo1(String[] names, String[] data, String dateFrom, String dateTo){
        List<List<String>> employers = Stream.of(data)
                .map(str -> str.split(" "))
                .filter(arr -> parserDate(arr[DATE_WORKING]).isBefore(parserDate(dateTo))
                            && parserDate(arr[DATE_WORKING]).isAfter(parserDate(dateFrom))
                            && List.of(names).contains(arr[EMPLOYER_NAME]))
                .map(arr -> List.of(arr[1], String.valueOf(Integer.parseInt(arr[HOURS_WORKING]) * Integer.parseInt(arr[HOUR_RATE]))))
                .toList();

        StringBuilder sb = new StringBuilder();
        sb.append("Report for period ").append(dateFrom)
                                        .append(" - ")
                                        .append(dateTo)
                                        .append("\n");
        TreeMap<String, Integer> salaryEmployers = new TreeMap<>();
        for (String name : names) {
            salaryEmployers.put(name, 0);
        }
        for (List<String> employer : employers) {
            salaryEmployers.put(employer.get(0), salaryEmployers.get(employer.get(0)) + Integer.parseInt(employer.get(1)));
        }
        for (var employer : salaryEmployers.entrySet()) {
            sb.append(employer.getKey())
                    .append(" - ")
                    .append(employer.getValue())
                    .append("\n");
        }
        return sb.toString().trim();
    }

    public static String getSalaryInfo2(String[] names, String[] data, String dateFrom, String dateTo) {
        String[] checkNames = new String[names.length];
        for (int i=0; i < names.length; i++) {
            int sum=0;
            for(String oneLine : data){
                String[] dataFromLine = oneLine.split(" ");
                if (dataFromLine[EMPLOYER_NAME].equals(names[i])
                    && parserDate(dataFromLine[DATE_WORKING])
                        .isAfter(parserDate(dateFrom))
                    && parserDate(dataFromLine[DATE_WORKING])
                        .isBefore(parserDate(dateTo))){

                    sum += Integer.parseInt(dataFromLine[HOURS_WORKING])
                            * Integer.parseInt(dataFromLine[HOUR_RATE]);
                }
            }
            checkNames[i] = names[i] + " - " + sum;
        }

        mySortMethod(names, checkNames);

        StringBuilder sb = new StringBuilder();
        sb.append("Report for period ").append(dateFrom)
                .append(" - ")
                .append(dateTo)
                .append("\n");
        sb.append(String.join("\n",checkNames));

        return sb.toString();
    }

    private static void mySortMethod(String[] names, String[]checkNames) {
        for(int c = names.length-1; c>0; c--) {
            int max = Integer.parseInt(checkNames[c].split(" ")[2]);
            for(int a=0; a<c; a++) {
                int salary = Integer.parseInt(checkNames[a].split(" ")[2]);
                if( max < salary){
                    String shift = checkNames[c];
                    checkNames[c] = checkNames[a];
                    checkNames[a] = shift;
                }
            }
        }
    }

    static LocalDate parserDate(String date){
        return LocalDate.parse(date,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}


/*
        26.04.2019 John 4 50
        05.04.2019 Andrew 3 200
        10.04.2019 John 7 100
        22.04.2019 Kate 9 100
        25.06.2019 John 11 50
        26.04.2019 Andrew 3 150
        13.02.2019 John 7 100
        26.04.2019 Kate 9 100
*/
/*
Report for period 01.04.2019  - 30.04.2019
        John - 900
        Andrew - 1050
        Kate - 1800
*/
/* John
   Andrew
   Kate
*/