public int[] swapEnds(int[] nums) {
  if(nums.length < 2) return nums;
  int temp = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  return nums;
}
