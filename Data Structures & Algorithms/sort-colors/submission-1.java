class Solution {
    public void merge(int[] nums, int s, int m,int e){
        int[] arr1= new int[m-s+1];
        int[] arr2= new int[e-m];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=nums[s+i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=nums[m+1+i];
        }
        int i=0;
        int j=0;
        int k=s;
        while(i<arr1.length&& j<arr2.length){
            if(arr1[i]<=arr2[j]){
                nums[k]=arr1[i];
                i++;
            }else{
                nums[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
             nums[k]=arr1[i];
                i++;
                k++;
        }
        while(j<arr2.length){
             nums[k]=arr2[j];
                j++;
                k++;
        }
    }
    public void mergeSort(int[] nums, int s,int e){
        if(s<e){
        int m=s+(e-s)/2;
        mergeSort(nums,s,m);
        mergeSort(nums,m+1,e);
        merge(nums,s,m,e);
        }
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        
    }
}