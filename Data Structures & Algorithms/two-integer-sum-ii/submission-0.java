class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) {
            return new int[]{};
        }
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
          //  int temp = numbers[left] + numbers[right];
            
            while(numbers[left] + numbers[right] < target) left++;
            while(numbers[left] + numbers[right] > target) right--;
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
    
}
