public int dateFashion(int you, int date) {
  if((date >= 8 || you >= 8) && (date > 2 && you > 2)) return 2;
  else if((date >= 2 || you >= 2) && (date <= 2 || you <= 2)) return 0;
  return 1;
}
