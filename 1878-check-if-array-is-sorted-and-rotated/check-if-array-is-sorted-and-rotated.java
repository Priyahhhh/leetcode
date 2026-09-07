class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int i, c = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                c++;
            }
            if (c > 1) {
                return false;
            }
        }
        return true;
    }
}