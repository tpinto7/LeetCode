class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i in range(len(nums)):
            offset = target - nums[i]
            if offset in dict:
                return [i, dict[offset]]
            dict[nums[i]] = i
        return []
        