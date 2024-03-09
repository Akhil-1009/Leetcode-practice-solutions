 class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] output = new int[nums.length];
    int[] count = new int[101]; // since the numbers are between 0 and 100
    for (int num : nums) {
        count[num]++;
    }
    for (int i = 1; i <= 100; i++) {
        count[i] += count[i-1];
    }
    for (int i = 0; i < nums.length; i++) {
        output[i] = nums[i] == 0 ? 0 : count[nums[i]-1];
    }
    return output;
}
}