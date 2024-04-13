class Solution {
    public int countGoodSubstrings(String s) {
        char a,b,c;
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            a=s.charAt(i);
            b=s.charAt(i+1);
            c=s.charAt(i+2);
            if(a!=b&&b!=c&&c!=a)
                count++;
        }
        return count;
    }
}