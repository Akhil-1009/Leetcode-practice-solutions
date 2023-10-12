 /**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */

class Solution {
public:
    int findInMountainArray(int target, MountainArray &mountainArr) {
        int n=mountainArr.length();
        int k;
        int l1=1,h1=n-1;
        while(l1<=h1){
            int mid=l1+(h1-l1)/2;
            if(mountainArr.get(mid-1) < mountainArr.get(mid) && mountainArr.get(mid)>mountainArr.get(mid+1)){
                k=mid;
                break;
            }
            else if(mountainArr.get(mid)>mountainArr.get(mid-1)) l1=mid+1;
            else h1=mid-1;
        }
        int p=k;
        if(target>mountainArr.get(k)) return -1;
        else{
            int low=0,high=k-1;
            while(low<=high && mountainArr.get(high)>=target){
                int mid=low+(high-low)/2;
                if(target==mountainArr.get(low)) return low;
                if(target==mountainArr.get(mid)) return mid;
                if(target==mountainArr.get(high)) return high;
                else if(target>mountainArr.get(mid)) low=mid+1;
                else high=mid-1;
            }
            if(target==mountainArr.get(k)) return p;
            low=k+1,high=n-1;
            while(low<=high && mountainArr.get(low)>=target){
                int mid=low+(high-low)/2;
                if(target==mountainArr.get(low)) return low;
                if(target==mountainArr.get(mid)) return mid;
                if(target==mountainArr.get(high)) return high;
                else if(target>mountainArr.get(mid)) high=mid-1;
                else low=mid+1;
            }
        }
        return -1;
    }
};