public int[] biggerTwo(int[] a, int[] b) {
  int sumA = 0, sumB = 0;
  for(Integer i : a){
    sumA += i;
  }
  for(Integer i : b){
    sumB += i;
  }
  if(sumA >= sumB) return a;
  else return b;
}
