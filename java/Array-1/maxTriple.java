public int maxTriple(int[] nums) {
  if(nums.length < 3) return nums[0];
  int max = 0;
  if(nums[0] > max) max = nums[0];
  if(nums[nums.length/2] > max) max = nums[nums.length/2];
  if(nums[nums.length-1] > max) max = nums[nums.length-1];
  return max;
}
