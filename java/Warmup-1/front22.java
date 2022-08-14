public String front22(String str) {
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }
  String front = str.substring(0, take);
  return front + str + front;
}
