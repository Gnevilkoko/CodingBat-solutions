public int sumLimit(int a, int b) {
  int sum = a+b;
  
  int len = String.valueOf(a).length();
  int sumLen = String.valueOf(sum).length();
  
  
  if(len == sumLen) return sum;
  return a;
}
