public int[] midThree(int[] nums) {
  int[] result = new int[3];
  result[0] = nums[nums.length/2-1];
  result[1] = nums[nums.length/2];
  result[2] = nums[nums.length/2+1];
  return result;
}
