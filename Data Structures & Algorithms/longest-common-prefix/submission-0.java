class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res= "";
        Arrays.sort(strs);
        int n = strs.length;
        for(int i=0;i<(Math.min(strs[0].length(), strs[n-1].length()));i++){
            if(strs[0].charAt(i)== strs[n-1].charAt(i)){
                res+=strs[0].charAt(i);
            }else break;
        }
        return res;
    }
}