class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(m==0){
            for(int i=0;i<nums2.length;i++){
                nums1[i]=nums2[i];
            }
        }
        for(int i=0;i<n;i++){
            int temp=nums1[i];
            nums1[i]=nums2[i];
            nums1[m+i]=temp;
        }
        Arrays.sort(nums1);
    }
}