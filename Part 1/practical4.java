import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float exp[] = new float[5];
        float sum = 0;
	System.out.println("Enter your expenses");
        for (int i = 0; i<5; i++) {
            exp[i]=sc.nextFloat();
            sum+= exp[i];
        }
        System.out.println("Your total expenses:"+sum);
    }
}
