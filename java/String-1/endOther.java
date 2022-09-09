public boolean endOther(String a, String b) {
  if(a.length() < b.length()){
    String temp = a;
    a = b;
    b = temp;
  }
  return a.substring(a.length()-b.length()).equalsIgnoreCase(b);
}
