public int greenTicket(int a, int b, int c) {
  if(a == b && b == c) return 20;
  else if(a == c || b == c || b == a) return 10;
  return 0;
}
