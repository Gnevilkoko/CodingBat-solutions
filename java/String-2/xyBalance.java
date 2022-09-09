public boolean xyBalance(String str) {
  int LastX = -1;
  for(int i = 0; i<str.length(); i++  ){
      if(str.substring(i, i+1).equalsIgnoreCase("x")) LastX = i;
  }
  if(LastX == -1) return true;
  String newStr = str.substring(LastX);
  for(int i = 0; i<newStr.length(); i++ ){
      if(newStr.substring(i, i+1).equalsIgnoreCase("y")) return true;
  }
  return false;
}
