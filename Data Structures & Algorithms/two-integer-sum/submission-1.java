class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> bla= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(bla.containsKey(complement)) {return new int[]{bla.get(complement), i};}
            bla.put(nums[i], i);
        }
    return new int[]{0,0};
        
    }
}
