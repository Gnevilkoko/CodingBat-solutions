public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
  if(a.length >= 2) {
    for(int i = 0; i < 2; i++) result[i] = a[i];
  }
  else if(a.length == 1) {
    result[0] = a[0];
    result[1] = b[0];
  }
  else if(a.length == 0){
    for(int i = 0; i < 2; i++) result[i] = b[i];
  }
  return result;
}
