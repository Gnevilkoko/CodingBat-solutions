public String withoutX(String str) {
  if(str.length() <= 1) return "";
  String result = "";
  if(str.charAt(0) == 'x') result += str.substring(1, str.length()-1);
  else result += str.substring(0, str.length()-1);
  if(str.charAt(str.length()-1) != 'x') result += str.charAt(str.length()-1);
  return result;
}
