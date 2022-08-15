public boolean nearTen(int num) {
  int val = num % 10;
  if((val >= 0 && val <= 2) || (val >= 8)) return true;
  return false;
}
