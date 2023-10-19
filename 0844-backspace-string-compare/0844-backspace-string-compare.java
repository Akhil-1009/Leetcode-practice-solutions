class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        String temp1=new String("");
        while(!stack.isEmpty())
        {
            temp1+=stack.peek();
            stack.pop();
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                stack.push(t.charAt(i));
            }
            else{
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        String temp2=new String("");
        while(!stack.isEmpty())
        {
            temp2+=stack.peek();
            stack.pop();
        }
        return temp1.equals(temp2);
    }
}