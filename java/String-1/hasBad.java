public boolean hasBad(String str) {
  for(int i = 0; i< 2; i++){
    if(str.length() < i+3) return false;
    if(str.substring(i, i+3).equalsIgnoreCase("bad")) return true;
  }
  return false;
}
