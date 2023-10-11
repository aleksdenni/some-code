package myTests;

import java.util.ArrayList;
import java.util.List;

public class MyTest4 {

    public static String convertListToString(Node list) {
        List<String> nodeList = new ArrayList<>();
        while (list.getNext()!=null){
            nodeList.add(list.getData()+"");
            list = list.getNext();
        }
        nodeList.add(list.getData()+" null");
        return String.join(" -> ", nodeList);
    }
}