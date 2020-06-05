class Solution {
    // Sorting array using merge sort
    public int[] sortArray(int[] nums) {
        reduce(nums, 0, nums.length - 1);
        return nums;
    }
    public void reduce(int[] nums, int left, int right){
        if(right <= left) return;
        int middle = (left + right)/2;
        reduce(nums, left, middle);
        reduce(nums, middle + 1, right);
        merge(nums, left, middle, right);
        
    }
    
    public void merge(int[] nums, int left, int middle, int right){
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            temp[i] = nums[i];
        }
        
        int rightPtr = middle + 1;
        int i = left;
        while(left <= middle && rightPtr <= right){
            if(temp[left] <= temp[rightPtr]){
                nums[i] = temp[left];
                left++;
            } else{
              nums[i] = temp[rightPtr];
                rightPtr++;
            }
            ++i;
        }
        
        while(left <= middle){
            nums[i] = temp[left];
            i++;
            left++;
        }
        
        while(rightPtr <= right){
            nums[i] = temp[rightPtr];
            i++;
            rightPtr++;
        }    
    }
    
    
}