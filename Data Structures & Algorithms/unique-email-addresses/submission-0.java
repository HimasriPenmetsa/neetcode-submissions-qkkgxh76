class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> u = new HashSet<>();
        for(String e : emails){
            String[] parts = e.split("@");
            String l = parts[0];
            String d = parts[1];
            l = l.split("\\+")[0];
            l = l.replace(".","");
            u.add(l+"@"+d);
        }
        return u.size();
    }
}