class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int i=0,j=2;
        while(i<nums.length)
        {
            if(nums[j]-nums[i]<=k)
            {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                for(int p=i;p<=j;p++)
                {
                    temp.add(nums[p]);
                }
                ans.add(temp);
            }
            else{
                int arr[][]=new int[0][0];
                return arr;
            }
            i=j+1;
            j+=3;
        }
        int arr[][]=new int[ans.size()][3];
        for(int r=0;r<ans.size();r++)
        {   ArrayList<Integer> a=ans.get(r);
            for(int s=0;s<3;s++)
            {
                arr[r][s]=a.get(s);
            }
        }
        return arr;
    }
}