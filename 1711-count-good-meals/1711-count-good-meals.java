class Solution {
    public int countPairs(int[] deliciousness) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int mod=1000000007;
        long res=0;
        for(int i=0;i<deliciousness.length;i++)
        {
            int power=1;
            for(int k=0;k<22;k++)
            {
                if(map.containsKey(power-deliciousness[i]))
                {
                    res+=map.get(power-deliciousness[i]);
                    res%=mod;
                }
                power*=2;
            }
            map.put(deliciousness[i], map.getOrDefault(deliciousness[i], 0) + 1);
        }
        return (int) res;
    }
}