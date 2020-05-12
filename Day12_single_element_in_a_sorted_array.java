class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            
            if(mid<nums.length-1 && mid>0){
                if(nums[mid+1]!=nums[mid] && nums[mid-1]!=nums[mid]){
                    return nums[mid];
                }
                else if(nums[mid+1]==nums[mid]){
                    if((mid-i)%2==0){
                        i=mid+2;
                    }
                    else{
                        j=mid-1;
                    }
                }
          
                else if(nums[mid-1]==nums[mid]){
                    if((j-mid)%2==0){
                        j=mid-2;
                    }
                    else{
                        i=mid+1;
                    }
                }
            }
        }
        return nums[j];
    }
}