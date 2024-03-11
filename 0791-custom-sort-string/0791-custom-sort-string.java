class Solution {
    public String customSortString(String order, String s) {
        int priority=1;
        
        int arr2[] =new int [26];
         
        for(int i=0;i<s.length();i++)
        {
            arr2[s.charAt(i)-97]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            char c=order.charAt(i);
            int index=c-97;
            if(arr2[index]>0)
            {
                while(arr2[index]>0)
                {
                    sb.append(c);
                    arr2[index]--;
                }
            }
        }
        for(int index=0;index<26;index++)
        {
            if(arr2[index]>0)
            { char ch=(char) (index+97);
                while(arr2[index]>0)
                {
                    sb.append(ch);
                    arr2[index]--;
                }
            }
        }
        return sb.toString();
    }
}