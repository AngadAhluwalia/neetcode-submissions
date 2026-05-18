class Solution {
    public void merge(int[]nums, int s,int m,int e){
    int[] n1=new int[m-s+1];
    int[] n2= new int[e-m];
    for(int i=0;i<n1.length;i++){
        n1[i]=nums[s+i];
    }
    for(int i=0;i<n2.length;i++){
        n2[i]=nums[m+1+i];
    }
    int i=0;int j=0;int k=s;
    while(i<n1.length && j<n2.length){
        if(n1[i]<=n2[j]){
            nums[k]=n1[i];
            i++;
        }else{
            nums[k]=n2[j];
            j++;
        }
        k++;
    }
    while (i<n1.length) { 
        nums[k]=n1[i];
            i++;
            k++;
    }
    while (j<n2.length) { 
          nums[k]=n2[j];
            j++;
            k++;
    }

}
public void mergeSort(int[]nums, int s,int e){
    if(s<e){

    int m=s+(e-s)/2;
    mergeSort(nums, s, m);
    mergeSort(nums, m+1, e);
    merge(nums, s, m, e);
    }
}
 public int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length-1);
    return nums;
 }
}