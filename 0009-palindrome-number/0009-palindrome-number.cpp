class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)return false;
        if(x==0)return true;
        int count=0;
        int temp=x;
        while(temp>10)
        {
            count++;
            temp=temp/10;
        }
        if(temp==10) count+=2;
        else count+=1;
        temp=x;
        long newno=0;
        while(temp!=0)
        {
            int p=temp%10;
            long power=pow(10,count-1);
            count--;
            newno=newno+(long)(p*power);
            temp=temp/10;
        }
        if(newno%x==0)
            return true;
        else return false;
        
    }
};