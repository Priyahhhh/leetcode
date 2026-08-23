class Solution {
    public boolean isSameAfterReversals(int num) {
        int n1=reverse(num);
        int n2=reverse(n1);
        return n2==num;
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
}
