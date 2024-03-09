class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp=new int[1001];
        for(int i:nums1)
        {
            temp[i]=1;
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++)
        {
            if(temp[nums2[i]]==1)
            {
                ans.add(nums2[i]);
                temp[nums2[i]]=0;
            }
        }
        int arr[] =new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}