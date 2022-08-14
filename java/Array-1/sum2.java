public int sum2(int[] nums) {
  if(nums.length == 0) return 0;
  if(nums.length < 2) return nums[nums.length-1];
  int result = 0;
  for(int i = 0; i < 2; i++){
    result += nums[i];
  }
  return result;
}
