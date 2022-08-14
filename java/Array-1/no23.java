public boolean no23(int[] nums) {
  for(Integer i : nums){
    if(i == 2 || i == 3) return false;
  }
  return true;
}
