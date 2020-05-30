class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        diff = k % len(nums) 
        if(diff == 0):
            return
        test = nums[-diff:]
        for i in range(len(nums)-1,-1, -1):
            if i < diff:
                nums[i] = test[i]
            else:
                nums[i] = nums[i - diff]