class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target - nums[i])){
                int idx = mp.get(target - nums[i]);
                if(idx >= i){
                    ans[0] = i;
                    ans[1] = idx;
                }
                else{
                    ans[0] = idx;
                    ans[1] = i;
                }
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}