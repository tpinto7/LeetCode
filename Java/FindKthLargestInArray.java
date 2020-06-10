class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(10, Collections.reverseOrder());
        for(int i = 0; i < nums.length; ++i){
            pQueue.add(nums[i]);
        }
        
        int current = -1;
        for(int i = 0; i < k; ++i){
            current = pQueue.poll();
        }
        
        return current;
    }
}