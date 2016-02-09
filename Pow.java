public class Pow {

    /**
     * Complexité en o(n)
     */
    public static int pow(int a, int n) {
        int returnVal = a;
        if (n == 0) {
            return 1;
        }
        for (int i = 0; i < n - 1; ++i) {
            returnVal *= a;
        }
        return returnVal;
    }

    /**
     * Complexité en o(log(n))
     */
    public static int pow2 (int a, int n) {
        int temp;
        if (n == 0) {
            return 1;
        }

        temp = pow2(a, n/2);
        if (n % 2 == 0) {
            return temp * temp;
        }
        return a * temp * temp;
    }

    public static void main (String[] args) {
        int test = 2;
        test = pow(test, 1);
        System.out.println(test);
    }
}
