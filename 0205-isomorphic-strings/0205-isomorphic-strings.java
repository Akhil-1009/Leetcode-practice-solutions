class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> our=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
          { //  if(s.charAt(i)==t.charAt(i)&&i!=0) return false;
            if(our.containsKey(s.charAt(i)))
            {
                if(our.get(s.charAt(i))!=t.charAt(i))
                {
                    return false;
                }
            }
            else if(our.containsValue(t.charAt(i))){
                return false;
            }
            else{
                our.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}