class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> ourmap=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            ourmap.put(nums2[i],i);
        }
        int arr[]=new int[nums1.length];
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            int index=ourmap.get(nums1[i]);
            while(index<nums2.length)
            {
                if(nums2[index]>nums1[i])
                {
                    arr[j++]=nums2[index];
                    break;
                }
                index++;
            }
            if(index==nums2.length)
            {
                arr[j++]=-1;
            }
        }
        return arr;
    }
}