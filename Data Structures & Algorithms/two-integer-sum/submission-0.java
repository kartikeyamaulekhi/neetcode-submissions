class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      int[] arr = new int[2];
      for(int i = 0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            arr[0] = map.get(nums[i]);
            arr[1] = i;
            break;
        }
        int no = target - nums[i];
        map.put(no,i);
      }
      return arr;   
    }
}
