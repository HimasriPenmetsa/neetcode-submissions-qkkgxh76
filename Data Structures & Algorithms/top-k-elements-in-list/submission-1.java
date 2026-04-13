class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int j : nums){
            mp.put(j,mp.getOrDefault(j,0)+1);
        }
        List<Integer> l = new ArrayList<>(mp.keySet());
        l.sort((a,b) -> mp.get(b) - mp.get(a));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = l.get(i);
        }
        return res;
    }
}
