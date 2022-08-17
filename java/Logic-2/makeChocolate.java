public int makeChocolate(int small, int big, int goal) {
  int maxBig = goal/5;
  if(maxBig > big) goal -= big*5;
  else goal -= maxBig*5;
  if(small >= goal) return goal;
  return -1;
}
