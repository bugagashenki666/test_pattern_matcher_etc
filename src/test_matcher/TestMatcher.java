package test_matcher;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+y");
        Matcher matcher = pattern.matcher("aaaay aaay ay ");
        boolean b = matcher.matches();
        System.out.println(b);
        String regEx = "([\\w.]{6,})@(\\w+)\\.([a-z]{2,4})";
        String str = "e-mails: kasyanov_k@list.ru , pichalych5@yandex.ru, leva.kgb@yandex.ru";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println("e-mail: " + m.group() + ": (1)=" + m.group(1) + "  (2)=" + m.group(2) + "   (3)=" + m.group(3));
        }
        Pattern p2 = Pattern.compile("\\d+\\s?");
        String ss[] = p2.split("aa4 yyyyyy0  4545gggg444 ffffff555   ");
        System.out.println(Arrays.toString(ss));
        String input_ =  "abdcxyz";
        simpleMatches("([a-z]*)([a-z]+)",input_);
        simpleMatches("([a-z]?)([a-z]+)",input_);
        simpleMatches("([a-z]+)([a-z]*)",input_);
        simpleMatches("([a-z]?)([a-z]?)",input_);
    }

    public static void simpleMatches(String regExp, String string) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println("(1)=" + matcher.group(1));
            System.out.println("(2)=" + matcher.group(2));
        }
        else
        {
            System.out.println("no matches");
        }
    }
}
