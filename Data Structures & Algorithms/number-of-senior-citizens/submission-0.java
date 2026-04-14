class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String each : details){
            StringBuilder sb = new StringBuilder();
            sb.append(each.charAt(11));
            sb.append(each.charAt(12));
            int age = Integer.parseInt(sb.toString());
            if(age > 60)
                count+=1;
        }
        return count;
    }
}