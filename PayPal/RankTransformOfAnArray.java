//Rank transform of an array
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        int[] finalResult = new int[arr.length];
        result = Arrays.copyOf(arr,arr.length);
        Arrays.sort(result);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int k = 1;
        for(int i = 0; i < result.length; i++) {
            if(!map.containsKey(result[i])) {
                map.put(result[i],k);
                k++;
            }
        }
        for(int i = 0; i < result.length; i++) {
            finalResult[i] = map.get(arr[i]);
        }
        return finalResult;
    }
}