class Solution {
      public String[] uncommonFromSentences(String s1, String s2) {
        String[] chars1 = s1.split(" ");
        String[] chars2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : chars1){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : chars2){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String s : map.keySet()){
            if (map.get(s) == 1){
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
