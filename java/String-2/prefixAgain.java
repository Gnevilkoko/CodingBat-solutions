public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n);
  for(int i = n; i<str.length()-prefix.length()+1; i++){
    if(str.substring(i, prefix.length()+i).equalsIgnoreCase(prefix)){
      return true;
    }
  }
  return false;
}
