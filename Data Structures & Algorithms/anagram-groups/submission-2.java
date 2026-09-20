class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String key = new String(s);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                map.put(key,new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        List<List<String>> bigList = new ArrayList<>();
        for(List<String> list: map.values()){
            bigList.add(list);
        }
        return bigList;
    }
}
