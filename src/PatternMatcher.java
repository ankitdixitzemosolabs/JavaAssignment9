

import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        Scanner keyBoardInput=new Scanner(System.in);
        System.out.println("Enter sentence");
        String s=keyBoardInput.nextLine();
        String regex="^[A-Z].*[.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        if(matcher.matches())
            System.out.println("Sentence starts with Capital letter and ends with '.'");
        else
            System.out.println("Sentence does not start with Capital letter or ends with '.'");


    }

}