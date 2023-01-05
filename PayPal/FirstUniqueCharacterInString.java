//First Unique character in a string
class Solution {
    public int firstUniqChar(String s) {
        HashMap<String , Integer> map = new HashMap<String, Integer>();
        String[] chars = s.split("");
        int index = -1;
        for(int i = 0; i < chars.length ; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i],1);
            } else {
                map.replace(chars[i],map.get(chars[i])+1);
            }
        }
        System.out.println(map);
        for(int i = 0; i < chars.length ; i++) {
            if(map.containsKey(chars[i]) && map.get(chars[i]) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}