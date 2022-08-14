public String extraEnd(String str) {
  String result = "";
  for(int i = 0; i<3; i++){
    result += str.substring(str.length()-2);
  }
  return result;
}
