public int[] makeLast(int[] nums) {
  int[] newNums = new int[nums.length*2];
  newNums[nums.length*2-1] = nums[nums.length-1];
  return newNums;
}
