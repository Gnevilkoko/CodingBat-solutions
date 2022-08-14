public boolean endsLy(String str) {
  if(str.length() < 2) return false;
  if(str.substring(str.length()-2).equalsIgnoreCase("ly")) return true;
  return false;
}
