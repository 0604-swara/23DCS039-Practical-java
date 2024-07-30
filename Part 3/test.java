import java.util.Scanner;

class Rectangle {
    int len, bre;

        Rectangle() {
    }

       Rectangle(int l, int b) {
        len = l;
        bre = b;
    }

        int area() {
        return len * bre;
    }
}

class test {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

       
        Rectangle r1 = new Rectangle(length, breadth);
        System.out.println("Area of r1: " + r1.area());

        
        Rectangle r2 = new Rectangle();
        System.out.println("Area of r2: " + r2.area());


    }
}
