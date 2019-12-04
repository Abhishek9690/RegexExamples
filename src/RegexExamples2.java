import java.util.regex.Pattern;

public class RegexExamples2 {
    public static void main(String[] args) {
        //System.out.println("meta_characters  d");//d for single digit
        //System.out.println(Pattern.matches("\\d{2}","12"));//\d represents single digit only 1-9 not any character nor special symbol

        //System.out.println("meta characters D");//D for non digit
        //System.out.println(Pattern.matches("\\D","ab"));

        //System.out.println("meta  characters D with quantifier....");
        System.out.println(Pattern.matches("\\D*","mark"));// * means unlimited


    }
}
