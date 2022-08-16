public int noTeenSum(int a, int b, int c) {
  return fixValue(a) + fixValue(b) + fixValue(c);
}

public int fixValue(int n){
  if((n >= 13 && n < 15) || (n > 16 && n <= 19)) return 0;
  return n;
}
