class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<jewels.length();i++)
        {
            map.put(jewels.charAt(i),1);
        }
        int count=0;
        for(int i=0;i<stones.length();i++)
        {   char c=stones.charAt(i);
            if(map.containsKey(c))
            {
                count++;
            }
        }
        return count;
    }
}