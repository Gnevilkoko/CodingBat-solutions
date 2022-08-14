public String without2(String str) {
  if(str.length() < 2) return str;
  String word = str.substring(0,2);
  if(word.equals(str.substring(str.length()-2))) return str.substring(2);
  return str;
}
