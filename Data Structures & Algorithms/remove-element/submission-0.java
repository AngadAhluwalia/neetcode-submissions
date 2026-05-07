class Solution {
    public int removeElement(int[] nums, int val) {
         ArrayList num=new ArrayList<>(nums.length);

        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
    for(int i=0 ;i<num.size();i++){
        if(num.get(i).equals(val)){
            num.remove(i);
            i--;
        }
    }
    for(int i=0; i<num.size(); i++) {
        nums[i] = (int)num.get(i);
    }
    return num.size();

    }
}