import java.util.Scanner;

public class practical8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();

        }
        for(int i=0;i<n;i++){
            if(a[i]==9)
            {
                count+=1;
            }
            else{
                count =0;
            }
        }
        System.out.println("Count 9: "+count);
    }
}

