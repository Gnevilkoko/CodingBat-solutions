public int[] maxEnd3(int[] nums) {
  for(int i = 0; i < nums.length; i++)
  {
    int max = 0;
    if(nums[0] < nums[2]) max = nums[2];
    else max = nums[0];
    nums[i] = max;
  }
  return nums;
}
