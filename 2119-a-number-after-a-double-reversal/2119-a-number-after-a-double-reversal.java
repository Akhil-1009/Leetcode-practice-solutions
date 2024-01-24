class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int dummy=num;
        int factor=1;
        int newno=0;
        while(dummy!=0)
        {
            if(dummy%10==0&&factor==1)
            {   dummy=dummy/10;
                continue;
            }
            newno+=(dummy%10)*factor;
            dummy/=10;
            factor*=10;
        }
        return newno==num;
        
    }
}