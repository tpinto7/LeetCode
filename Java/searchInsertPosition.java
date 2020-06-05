class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        
        while(right >= left){
            int middle = (left + right) / 2;
            int value = nums[middle];
            
            if(value == target) return middle;
            else if (value > target) right = middle - 1;
            else left = middle + 1;
        }
        if(left > right) return left;
        return nums[left] > target ? left : left + 1;
    }
}