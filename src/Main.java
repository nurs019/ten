public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        int gcd = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd);

        a = 10;
        b = 7;
        gcd = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
    }
}
