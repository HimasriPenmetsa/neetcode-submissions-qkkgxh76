class Solution {
    public String longestCommonPrefix(String[] strs) {
        String com = strs[0];
        for(int i=1;i<strs.length;i++){
            String str = strs[i];
            int j = 0;
            while(j<com.length() && j<str.length()){
                if(str.charAt(j) != com.charAt(j)){
                    break;
                }
                j+=1;
            }
            com = com.substring(0,j);
        }
        return com;
    }
}