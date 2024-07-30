public class practical9{

    public static String doubleChar(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }
        public static void main(String[] args) {
            // Test cases
System.out.println(doubleChar("The"));
            System.out.println(doubleChar("AAbb"));
            System.out.println(doubleChar("Hi-There"));
        }
    }
