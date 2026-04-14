class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] fst = strs[0].toCharArray();
        char[] lst = strs[strs.length - 1].toCharArray();
        for(int i=0;i<fst.length;i++){
            if(fst[i] != lst[i])
                break;
            sb.append(fst[i]);
        }
        return sb.toString();
    }
}