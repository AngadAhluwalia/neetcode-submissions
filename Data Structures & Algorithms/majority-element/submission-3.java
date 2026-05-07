class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int num:nums){
            if(ans.containsKey(num)){
                ans.put(num , ans.get(num)+1);
            }
            else{
                ans.put(num, 1);
            }
        }
        int g=0;
        for(int n:ans.keySet()){
            if(ans.get(n)>nums.length/2){
                return n;
            }
        }
        return -1;
    }
}