package webdb81;

import java.util.*;

/**
 * Created by ishi on 2014/07/26.
 */
public class Begin {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zz", "dddd", "bb", "aaa");
        Collections.sort(list,
                Begin::mycompare);
        System.out.println(list);
    }
    static int mycompare(String l, String r) {
        int i = Integer.compare(r.length(), l.length());
        return i == 0 ? l.compareTo(r) : i;
    }
}
