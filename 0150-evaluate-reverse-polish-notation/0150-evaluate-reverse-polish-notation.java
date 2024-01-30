class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<String>();
        int size=tokens.length;
        for(int i=0;i<size;i++)
        {      String cmp=tokens[i];
                char ch=cmp.charAt(0);
            if((cmp.length()==1)&&(ch=='+'||ch=='-'||ch=='*'||ch=='/'))
            {
                int right=Integer.parseInt(st.pop());
                int left=Integer.parseInt(st.pop());
                int ans;
                if(ch=='+')
                {
                    ans=left+right;
                }
                else if(ch=='-'){
                    ans=left-right;
                }
                else if(ch=='*'){
                    ans=left*right;
                }
                else{
                    ans=left/right;
                }
                st.push(Integer.toString(ans));
            }
            else{
                st.push(cmp);
            }
        }
        return Integer.parseInt(st.peek());
    }
}