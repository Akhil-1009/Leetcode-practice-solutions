class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> ourmap=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            ourmap.put(nums1[i],i);
        }
        int arr[]=new int[nums1.length];
        int j=0;
         Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&st.peek()<nums2[i])
            {
                st.pop();
            }
            if(ourmap.containsKey(nums2[i]))
            {
                if(!st.isEmpty())
                {
                    arr[ourmap.get(nums2[i])]=st.peek();
                }
                else{
                    arr[ourmap.get(nums2[i])]=-1;
                }
            }
            st.push(nums2[i]);
        }
        return arr;
    }
}
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         //Create a reverse mapping of the queries in `nums1` by iterating through 
//         //the array and storing the reverse mapping in a hashmap. 
//         Map<Integer, Integer> queryReverseMapping = new HashMap<>();
//         for(int i=0;i<nums1.length;i++) {
//             queryReverseMapping.put(nums1[i], i);
//         } 

//         //Loop through all the numbers in nums2 from the end back to the start. 
//         Stack<Integer> stack = new Stack<>();
//         for(int i = nums2.length - 1;i>=0;i--) {
//             int result = -1;
//             //For each number wipe any numbers less than it off the stack.
//             while(!stack.isEmpty() && stack.peek() <= nums2[i]) {
//                 stack.pop();
//             }

//             //Find the last remaining element if there is one. This is the next greater element.
//             if(!stack.isEmpty()) {
//                 result = stack.peek();
//             }

//             //Put the current element on the stack. 
//             stack.push(nums2[i]);

//             //Use the reverse mapping to see if there is a query for this current number, 
//             //if there is store the result at the appropriate index using the reverse mapping. 
//             if(queryReverseMapping.containsKey(nums2[i])) {
//                 nums1[queryReverseMapping.get(nums2[i])] = result;
//             }
//         }

//         return nums1;
//     }
// }