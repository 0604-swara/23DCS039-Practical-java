public class practical11 {
    public static void main(String[] args) {

        String name="CHARUSAT UNIVERSITY";

        int length= name.length();
        System.out.println("Length of string:"+ length);

        String replace = name.replace('H','S');
        System.out.println("Replaced string:" + replace);

        String lowerCase = name.toLowerCase();
        System.out.println("String change in lower case: "+lowerCase);

    }
}
