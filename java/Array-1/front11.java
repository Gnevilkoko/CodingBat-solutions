public int[] front11(int[] a, int[] b) {
  if(a.length <= 0 && b.length <= 0) return a;
  else if(a.length <= 0) {
    int[] result = {b[0]};
    return result;
  }
  else if(b.length <= 0){
    int[] result = {a[0]};
    return result;
  }
  int[] result = {a[0], b[0]};
  return result;
}
