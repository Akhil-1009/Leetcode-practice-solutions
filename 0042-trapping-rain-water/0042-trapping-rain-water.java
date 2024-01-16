class Solution {
    public int trap(int[] height) {
        int arr1[]=new int[height.length];
        int arr2[]=new int[height.length];
        int lmax=0;
        int rmax=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>lmax)
            {
                lmax=height[i];
                arr1[i]=lmax;
            }
            else{
                arr1[i]=lmax;
            }
            }
        for(int j=height.length-1;j>=0;j--)
        {
            if(height[j]>rmax)
            {
                rmax=height[j];
                arr2[j]=rmax;
            }
            else{
                arr2[j]=rmax;
            }
        }
        int water=0;
        for(int i=0;i<height.length;i++)
        {
            water+=Math.min(arr1[i],arr2[i])-height[i];
        }
        return water;
    }
}