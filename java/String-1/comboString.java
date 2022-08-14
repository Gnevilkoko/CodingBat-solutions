public String comboString(String a, String b) {
  String shorter = a;
  if(a.length() < b.length()){
    shorter = b;
    b = a;
  }
  return b+shorter+b;
}
