import java.util.Scanner;

public class practical7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();

        System.out.println("Enter the number of times to print");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(s.substring(0,3));
        }

    }
}
