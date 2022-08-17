public boolean closeFar(int a, int b, int c) {
  int aToB = Math.abs(a-b);
  int aToC = Math.abs(a-c);
  int bToC = Math.abs(b-c);
  
  
  if(aToB <= 1 && aToC >= 2 && bToC >= 2) return true;
  else if(aToC <= 1 && aToB >= 2 && bToC >= 2) return true;
  return false;
}
