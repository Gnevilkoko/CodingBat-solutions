public String repeatFront(String str, int n) {
  String result = "";
  for(int i = 0; i < n; i++){
    result += str.substring(0, n-i);
  }
  return result;
}
