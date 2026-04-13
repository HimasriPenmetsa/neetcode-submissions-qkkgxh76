class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            int maxKey = -1;
            int maxFreq = -1;
            for(int key : mp.keySet()){
                if(mp.get(key) > maxFreq){
                    maxFreq = mp.get(key);
                    maxKey = key;
                }
            }
            res[i] = maxKey;
            mp.remove(maxKey);
        }
        return res;
    }
}
