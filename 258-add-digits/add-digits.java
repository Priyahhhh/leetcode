class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            for (int n = num; n != 0; n = n / 10) {
                int d = n % 10;
                sum = sum + d;
            }
            num = sum;
        }
        return num;
    }
}