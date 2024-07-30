import java.util.Scanner;

class Complex {
    int real;
    int imag;

        public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    
    public Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

       public Complex subtract(Complex other) {
        return new Complex(real - other.real, imag - other.imag);
    }

    
    public Complex multiply(Complex other) {
        int realPart = real * other.real - .imag * other.imag;
        int imagPart = real * other.imag + imag * other.real;
        return new Complex(realPart, imagPart);
    }

   
    public String toString() {
        return real + " + " + imag + "i";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        int real1 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the first complex number: ");
        int imag1 = scanner.nextInt();
        Complex c1 = new Complex(real1, imag1);

        System.out.print("Enter the real part of the second complex number: ");
        int real2 = scanner.nextInt();
        System.out.print("Enter the imaginary part of the second complex number: ");
        int imag2 = scanner.nextInt();
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

       
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

           }
}

