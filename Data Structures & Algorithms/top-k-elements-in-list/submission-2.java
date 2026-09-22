class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>= max) max= map.get(i);
        }
        List<Integer> list = new ArrayList<>();
        while(k!=0){
            for(int i: map.keySet()){
                if(map.get(i)==max) {
                    list.add(i);
                    k--;
                    }
            }
            max--;
            
        }
        int arr[]= new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
