class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            while(st.size()>0 && k>0 && st.peek()>ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        if(sb.length()==0) sb.append('0');
        sb.reverse();
        int pointer=0;
        while(pointer<sb.length()&&sb.charAt(pointer)=='0')
        {
            pointer++;
        }
        if(pointer==sb.length()) pointer--;
        String ans=sb.substring(pointer);
        return ans;
    }
}