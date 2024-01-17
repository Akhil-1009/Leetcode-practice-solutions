class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> ourmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(ourmap.containsKey(arr[i]))
            {
                ourmap.put(arr[i],ourmap.get(arr[i])+1);
            }
            else{
                ourmap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : ourmap.entrySet())
        {
            Integer value=entry.getValue();
            ourmap.put(entry.getKey(),0);
            if(ourmap.containsValue(value))
            {
                return false;
            }
            
        }
        return true;
        
    }
}