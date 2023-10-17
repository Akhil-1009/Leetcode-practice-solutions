class Solution {
    public boolean rotateString(String s, String goal) {
         StringBuffer sb=new StringBuffer(s);
        if(s.length()!=goal.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(goal.contentEquals(sb))
            {
                return true;
            }
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            // System.out.println(sb);
        }
        return false;
    }
}