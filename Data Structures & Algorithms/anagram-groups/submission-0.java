class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[]= strs[i].toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
                map.get(st).add(strs[i]);
                continue;
            }
            map.get(st).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
        
    }
}
