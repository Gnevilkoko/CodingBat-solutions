public int[] frontPiece(int[] nums) {
  if(nums.length < 2) return nums;
  int[] result = new int[2];
  for(int i = 0; i < 2; i++) result[i] = nums[i];
  return result;
}
