import java.util.regex.Pattern;
public class RegexExamples3 {
    public static void main(String[] args) {
        System.out.println("? quantifier");
        System.out.println(Pattern.matches("[amn]?","a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?","aammnn"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aazzta"));//false (a or m or n comes one time)

        System.out.println("+ quantifier");
        System.out.println(Pattern.matches("[amn]+","a"));//true a or m or n once or more time
        System.out.println(Pattern.matches("[amn]+","aaa")); // true a comes more then one time
        System.out.println(Pattern.matches("[amn]+","aaammmnnn")); // a or m or n comes more then one time
        System.out.println(Pattern.matches("[amn]+","aaazztt")); // z or t are not matching pattern



    }

}
