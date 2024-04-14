 class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> rb = new ArrayList<>();
        backtrack(rb, new ArrayList(), nums);
        return rb;
    }
    public void backtrack(List<List<Integer>> rb, ArrayList<Integer> temp, int[]nums)
    {
        if(nums.length==temp.size())
        {
            rb.add(new ArrayList(temp));
            return;
        }
        for(int number: nums)
        {
            if(temp.contains(number))
            continue;
            temp.add(number);
            backtrack(rb, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}