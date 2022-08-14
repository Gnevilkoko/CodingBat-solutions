public String extraFront(String str) {
  if(str.length() < 2) return str+str+str;
  String result = "";
  for(int i = 0; i < 3; i++){
    result += str.substring(0,2);
  }
  return result;
}
