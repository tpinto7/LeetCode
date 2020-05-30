class Solution {
    public int search(int[] nums, int target) {
        if(nums == null) return -1;
        int left = 0; 
        int right = nums.length - 1;
        // int middle = 0;
        while(right >= left){
            if(right == left) {
                if(nums[left] == target) return left;
                return -1;
            }
            
            int middle = (right + left) / 2;
            if(nums[middle] == target) return middle;
            else if(nums[middle] < target) left = middle + 1;
            else right = middle;
        }
        return -1;
    }
}