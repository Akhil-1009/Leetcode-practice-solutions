class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.size();i++)
        {
            int first=nums.get(i).get(0);
            int second=nums.get(i).get(1);
            for(int j=first;j<=second;j++)
            {
                set.add(j);
            }
        }
        return set.size();
    }
}