class Solution {

    public double myPow(double x, int n) {
        return power(x, (long)n);
    }

    private double power(double x, long n) {

        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            return 1.0 / power(x, -n);
        }

        double pow = power(x, n / 2);

        if (n % 2 == 0) {
            return pow * pow;
        } else {
            return pow * pow * x;
        }
    }
}