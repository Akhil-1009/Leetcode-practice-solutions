 class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            int temp = n;
            n = 0;
            while(temp > 0){
                n += Math.pow(temp % 10, 2);
                temp /= 10;
            }
        }
        return (n == 1);
    }
}