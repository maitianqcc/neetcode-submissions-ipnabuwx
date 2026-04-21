class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map num and frequence
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // transfer the bucket, index is frequence, value is the num with the frequence
        List<Integer>[] bucket = new List[nums.length + 1];
        for (var entry: map.entrySet()) {
            int frequence = entry.getValue();
            if(bucket[frequence] == null) bucket[frequence] = new ArrayList<>();
            bucket[frequence].add(entry.getKey());
        }
        // loop the bucket from tail, get K number
        // inner loop bucket[index], 
        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num: bucket[i]) {
                    res[index++] = num;
                    if (index == k) break;
                }
            }
        }
        return res;
    }
}
