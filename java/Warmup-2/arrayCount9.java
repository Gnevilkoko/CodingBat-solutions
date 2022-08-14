public int arrayCount9(int[] nums) {
  int count = 0;
  for(int val : nums){
    if(val == 9) count++;
  }
  return count;
}
