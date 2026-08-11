class Solution {
    public int reverse(int x) {
        int sum = 0;

        for (int n = x; n != 0; n = n / 10) {
            int d = n % 10;

            if (sum > Integer.MAX_VALUE / 10 || 
                sum < Integer.MIN_VALUE / 10) {
                return 0;
            }

            sum = sum * 10 + d;
        }

        return sum;
    }
}