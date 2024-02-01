 class Solution {
     public static int countDigits(int num) {
        int Numcopy = num;
        int count = 0;
        while(num != 0) {
            int digit = num % 10; 
            if(Numcopy % digit == 0 ) {
                count++;
            }
            num = num / 10; 

        }

        return count;
    }
}