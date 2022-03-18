import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {
    public static boolean validatePhoneNumberUsingRegex(String s) {
        if (s == null)
            return false;

        Pattern pattern = Pattern.compile("(0|84)[0-9]{9}");
        Matcher match = pattern.matcher(s);

        return match.matches();
    }

    public static boolean validatePhoneNumber(String s) {
        if (s == null)
            return false;
        
        if(!isInteger(s))
            return false;

        if(s.charAt(0) == '0' && s.length() != 10)
            return false;
        
        if((s.charAt(0) == '8' && s.charAt(1) == '4') && s.length() != 11)
            return false;

        if(s.charAt(0) != '0' && !(s.charAt(0) == '8' && s.charAt(1) == '4'))
            return false;

        return true;
    }

    public static boolean isInteger(String s){
        try {
            long x = Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "841111222333";
        System.out.println(validatePhoneNumber(s));
        System.out.println(validatePhoneNumberUsingRegex(s));
    }
}
