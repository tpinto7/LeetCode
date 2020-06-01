class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i){
            if(indexes.get(target - nums[i]) != null){
                return new int[]{indexes.get(target - nums[i]), i};
            }
            indexes.put(nums[i], i);
        }
        return null;
    }
}