package tech.bts.javaexamples.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    /**
     * returns a string made of s */

    public static String repeat (String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    public static String padLeft (String s, int n) {

        return repeat(" ", n - s.length()) + s;
    }

    /**returns a string containing s plus spaces to the right so the resulting string has length n */
    public static String padRight (String s, int n) {

        return s + repeat(" ", n - s.length());
    }

}