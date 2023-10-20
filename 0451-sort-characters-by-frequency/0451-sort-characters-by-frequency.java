class Solution {
    public String frequencySort(String s) {
        String ans="";
        int []arr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }
        int ind=0;
        while(ind<s.length())
        {
            int max=Integer.MIN_VALUE;
            int index=-1;
            for(int i=0;i<256;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                    index=i;
                }
            }
            arr[index]=0;
            for(int j=0;j<max;j++)
            {
                ans+=(char) index;
                ind++;
            }
            // ind++;
        }
        return ans;
    }
}