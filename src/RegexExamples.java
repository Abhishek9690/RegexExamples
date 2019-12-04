import java.util.regex.Pattern;
public class RegexExamples {
    public static void main(String[] args) {
        //System.out.println(Pattern.matches("[a-zA-Z0-9]{12}","abhishek8279"));//true
        //System.out.println(Pattern.matches("[0-9]{10}","8279394692"));
        System.out.println("meta characters");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","7123456789")); // \d{9} represents 9 digits are allowed
    }
}
