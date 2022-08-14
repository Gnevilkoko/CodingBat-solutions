public int[] makeMiddle(int[] nums) {
  int[] result = new int[2];
  result[0] = nums[nums.length/2-1];
  result[1] = nums[nums.length/2];
  return result;
}
