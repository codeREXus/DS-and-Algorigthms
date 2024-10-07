class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 0, sum = 0;
        prod = Prod(n);
        sum = Sum(n);
        return prod - sum;

    }
    int Prod(int n) {
        int prod = 1;
        while (n > 0) {
            int d = n % 10;

            prod *= d;
            n /= 10;
        }
        return prod;
    }
    int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }
}
