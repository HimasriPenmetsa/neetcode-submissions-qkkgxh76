class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int first = -1;
        boolean found = false; 
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                first = i;
                found = true;
                break;
            }
        }
        if(!found){
            return nums.length;
        }
        for(int j = first+1;j < nums.length; j++){
            if(nums[j] != val){
                int temp = nums[j];
                nums[j] = nums[first];
                nums[first] = temp;
                first++;
            }
        }
        return first;
    }
}