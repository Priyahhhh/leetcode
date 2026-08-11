class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int sum = 0;

        for (; n != 0; n = n / 10) {
            int d = n % 10;
            sum = sum * 10 + d;
        }

        return x == sum;
    }
}